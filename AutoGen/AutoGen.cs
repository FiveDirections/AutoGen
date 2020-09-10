//
// FACILITY:	AutoGen - Autogenerate Detours for the specified executable or DLL
//
// DESCRIPTION:	This program takes a list of executables (PE/COFF) and generates Detours for all the imports. 
//
//				NOTE: Both Google and Bing will fail the lookup of an API if too many are done per minute, returning HTTP error 429 (Too 
//					  Many Requests), so lookups are stored in an Access database to prevent having to lookup the same API more than once (which also 
//					  increases performance)
//
//				This code isn't as efficient as it could be, and it would probably benefit greatly by the use of asynch-await
//
//				TODO:
//					Instead of using Bing/Google to find the documentation web pages, find the markdown file on Microsoft's GitHub site for the API.
//					Currently, the database is opened and closed for each operation. It would be much more efficient to leave it open. Fixing this
//					hasn't been a priority because we need to throttle the rate at which web searches are done, anyways.
//					Store the AST (Abstract Syntax Tree) for the function prototypes in the database, so we don't have to parse each one when
//					generating a Detour
//
// VERSION:		1.1
//
// AUTHOR:		Brian Catlin
//
// CREATED:		2019-10-01
//
// MODIFICATION HISTORY:
//
//	1.1		2020-03-08	Brian Catlin
//			General cleanup before release
//
//	1.0		2019-10-01	Brian Catlin
//			Original version
//

//
// System namespaces
//

using System;
using System.Collections.Generic;
using System.Data;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading;

//
// Third-party NuGet namespaces
//

using HtmlAgilityPack;                                  // https://html-agility-pack.net/

using PeNet;                                            // https://github.com/secana/PeNet

using ScrapySharp.Extensions;                           // https://www.nuget.org/packages/ScrapySharp
using ScrapySharp.Network;

namespace FDI.AutoGen
	{

	class Program
		{

		//
		// List of DLLs that we normally don't scan. There is usually no point in interecpting calls to the C Run Time Library. This can be overridden
		// using the /ALL qualifier
		//

		static readonly List <Regex>   skip_dlls = new List <Regex>
			{
			new Regex (@"MSVCRT\.DLL", RegexOptions.Compiled | RegexOptions.IgnoreCase),
			new Regex (@"API-MS-WIN-CRT-[\w\!\@\#\$\%\^\&\(\)\+\-\[\]\{\}\,\; \.]*?\.DLL", RegexOptions.Compiled | RegexOptions.IgnoreCase),	// Equivalent to API-MS-WIN-CRT*.DLL
			};

		static List <string>    dlls_processed = new List <string> ();
		static uint				total_added = 0;
		static uint				total_found = 0;

		/// <summary>
		/// Main entry point into the program. It just parses the command line and calls the routine to process the files
		/// </summary>
		static void 
		Main ()
			{
			string					console_title = Console.Title;
			Command_Parser			command_parser = new Command_Parser ();
			Command_Line_Options	parsed_command_line;
			string					command;
			int						cmd_start;


			//
			// If we're being run from within the debugger or the path contains a space, then the first token in the command line will be the path to
			// the executable, surrounded by double quotes. If the first character is a double-quote, then find the matching double-quote
			//

			if (Environment.CommandLine [0] == '\"')
				{
				cmd_start = Environment.CommandLine.IndexOf ('\"', 1) + 1;
				}
			else
				{

				//
				// No double-quote, so we must be run from a command line. Skip past the first token, which is the name of the executable
				//

				cmd_start = Environment.CommandLine.IndexOf (' ', 1) + 1;
				}

			//
			// Extract just the qualifiers
			//

			command = Environment.CommandLine.Substring (cmd_start);

			//
			// Parse the command
			//

			parsed_command_line = Command_Parser.do_parse (command);

			//
			// If the user asked for help, then display it; otherwise, process the input files
			//

			if (parsed_command_line.help)
				{
				Command_Parser.output_help ();
				}
			else 
				{
				try
					{

					//
					// Create the output file first, to ensure that there won't be any problems with it. We don't want do all the work and then not be
					// able to save the data
					//

					var fs = File.Create (parsed_command_line.output);
					fs.Close ();

					//
					// Ensure that the API database file is where it is supposed to be
					//

					if (!File.Exists (parsed_command_line.database))
						{
						throw new ArgumentException ($"Database file {parsed_command_line.database} not found");
						}

					//
					// Process all the input files
					//

					process_files (parsed_command_line);
					}
				finally
					{

					//
					// Restore the console title before exiting
					//

					Console.Title = console_title;
					}

				}

			}   // End Main

		/// <summary>
		/// Look for a file in the usual directories. This supports relative paths and wildcards in the file name
		/// </summary>
		/// <param name="File_name">Name of file to find</param>
		/// <returns>List of file path strings</returns>
		public static List <string>
		find_files
			(
			string File_name
			)
			{
			List <string>	file_list = new List <string> ();
			string []		files;
			string			path = Path.GetDirectoryName (File_name);
			string			name = Path.GetFileName (File_name);
			bool			path_specified = (path.Length != 0);

			//
			// Does this contain a relative path?
			//

			if (path.Contains ("..") || path.Contains (".\\"))
				{

				//
				// Resolve the relative path to an absolute path
				//

				path = Path.GetFullPath (path);
				}

			//
			// If the file name doesn't contain a path, then use the current directory
			//

			if (path.Length == 0)
				{
				path = Directory.GetCurrentDirectory ();
				}

			//
			// Find the file(s) (wildcards supported)
			//

			files = Directory.GetFiles (path, name);
			file_list.AddRange (files);

			//
			// Only search the system directories if the user didn't specify a path
			//

			if (files.Length == 0 && !path_specified)
				{
				string      windir = Environment.GetEnvironmentVariable ("WINDIR");
				string []   dll_locations = new string []		// Places to look (all are subdirectories of %WINDIR% (usually C:\WINDOWS))
								{
								"\\",
								"\\System32\\",
								"\\System32\\DownLevel\\",
								"\\SysWoW64"
								};

				//
				// Look for the file(s) in all the usual system directories
				//

				foreach (string dir in dll_locations)
					{
					path = windir + dir;
					files = Directory.GetFiles (path, name);
					file_list.AddRange (files);

					//
					// If we found any files then don't look in the rest of the DLL locations, because there are frequently duplicates
					//

					if (files.Length > 0)
							{
							break;
							}

					}   // End foreach

				}

			return file_list;
			}   // End find_files

		/// <summary>
		/// Add the exports for the specified file to the database
		/// </summary>
		/// <param name="File_name">Name of the file to lookup its exported routines</param>
		/// <param name="Parsed_command">Comand line flags</param>
		/// <param name="Api_list">List of API names that were found</param>
		private static void
		get_exports
			(
			string					File_name,
			Command_Line_Options	Parsed_command,
			ref List <Api_Record>	Api_list
			)
			{
			bool        skip;
			uint        count_added = 0;
			uint        count_found = 0;
			bool		in_exclude_dlls = false; ;
			string		file_name_with_path;
			string		just_file_name;

			Console.Title = "AutoGen: exports from " + File_name;

			//
			// If the file name doesn't contain a path, then try to find it
			//

			if (Path.GetDirectoryName (File_name).Length == 0)
				{
				var files = find_files (File_name);

				if (files.Count > 0)
					{
					file_name_with_path = files [0];	// There shouldn't be more than one
					}
				else
					{
					file_name_with_path = "";
					}

				}
			else
				{
				file_name_with_path = File_name;
				}

			just_file_name = Path.GetFileName (file_name_with_path);

			//
			// Only continue if the file was found
			//

			if (File.Exists (file_name_with_path))
				{

				//
				// Did the user specify /EXCLUDE_DLLS?
				//

				if (Parsed_command.exclude_dlls.Count != 0)
					{

					//
					// Is this DLL on the exclude list?
					//

					foreach (var re in Parsed_command.excluded_dlls_regex)
						{

						if (re.IsMatch (just_file_name))
							{
							in_exclude_dlls = true;
							break;
							}
						}

					}
				else
					{
					in_exclude_dlls = false;
					}

				//
				// If the user didn't specify /ALL (all DLLs, including the normally skipped C Run TIme Library DLLs) and this DLL is in the skip 
				// list, or the user specified /INCLUDE_DLLS and the DLL isn't on the include list, then we'll skip it
				//

				skip = ((!Parsed_command.all && is_filename_on_skip_list (just_file_name)) || (Parsed_command.exclude_dlls.Count != 0 && in_exclude_dlls));

				if (skip)
					{

					if (Parsed_command.verbose)
						{
						Console.WriteLine ("\t*** Skipping all exports in this DLL ***");
						}

					}
				else if (Path.GetExtension (just_file_name).ToUpper () == ".DLL" && dlls_processed.Contains (just_file_name))
					{

					if (Parsed_command.verbose)
						{
						Console.WriteLine ("This DLL has already been processed");
						}

					}
				else
					{

					if (Parsed_command.verbose)
						{
						Console.WriteLine ($"Procesing {file_name_with_path} exports");
						}

					//
					// Open the executable and get the list of exports
					//

					var pe_hdr = new PeNet.PeFile (file_name_with_path);
					string func_name;

					if (pe_hdr.HasValidExportDir && pe_hdr.ExportedFunctions != null)
						{

						//
						// Walk the list of exported APIs
						//

						foreach (ExportFunction func in pe_hdr.ExportedFunctions)
							{
							Api_Record api_record = new Api_Record ();

							//
							// Some exports don't have a name, so check if it has one
							//
							// TODO: Add support for unnamed APIs
							//

							if (func.Name != null)
								{
								func_name = func.Name;

								if (Parsed_command.verbose)
									{
									Console.Write ($"\t{func_name}");
									}

								//
								// If this is a C++ mangled ("decorated") name, then unmangle it and display that in parentheses
								//

								if (func.Name.StartsWith ("?"))
									{
									func_name = NativeMethods.undecorate_name (func.Name);

									if (Parsed_command.verbose)
										{
										Console.Write ($" ({func_name})");
										}

									}

								//
								// Is the API in the database?
								//

								if (api_record.lookup_api (Parsed_command.database, func_name))
									{
									count_found++;

									if (Parsed_command.verbose)
										{
										Console.Write (" FOUND");
										}

									}
								else
									{

									//
									// API not in the database. Find the help web page for this API
									//

									if (scrape_api_from_web_page (func_name, just_file_name, Parsed_command.verbose, ref api_record))
										{

										//
										// Add the record to the database
										//

										api_record.set_actual_dll (just_file_name);
										api_record.set_time_added (DateTime.Now);
										api_record.add_to_database (Parsed_command.database);
										count_added++;

										if (Parsed_command.verbose)
											{
											Console.Write (" ADDED");
											}

										}
									else
										{

										//
										// Couldn't find the API web page
										//

										if (Parsed_command.verbose)
											{
											Console.WriteLine ();
											}

										continue;
										}

									}

								//
								// Add this API's details to the Detours that we will make
								//

								Api_list.Add (api_record);
								}
							else
								{

								//
								// The export is not referenced by name; just by its ordinal
								//
								// TODO: Support ordinals
								//

								if (Parsed_command.verbose)
									{
									Console.Write ($"\tNO NAME, Ordinal = {func.Ordinal}");
									}

								}

							if (Parsed_command.verbose)
								{
								Console.WriteLine ();
								}

							}   // End foreach exports

						//
						// Add this DLL to the list of DLLs already processed
						//

						dlls_processed.Add (just_file_name);
						}
					else
						{

						if (Parsed_command.verbose)
							{
							Console.WriteLine ("\tNo exported functions");
							}

						}

					}

				total_added += count_added;
				total_found += count_found;

				if (Parsed_command.verbose)
					{
					Console.WriteLine ($"Exports Added = {count_added}, Found = {count_found}, Total added = {total_added}, Total found = {total_found}");
					}

				}
			else
				{
				Console.WriteLine ($"Couldn't find file {File_name}");
				}

			}   // End get_exports

		/// <summary>
		/// Add the imports for the specified file to the database
		/// </summary>
		/// <param name="File_name">Name of the PE/COFF file to lookup its imported routines</param>
		/// <param name="Parsed_command">Comand line flags</param>
		/// <param name="Api_list">List of API names that were found</param>
		private static void
		get_imports
			(
			string					File_name,
			Command_Line_Options	Parsed_command,
			ref List <Api_Record>	Api_list
			)
			{
			bool			skip = false;
			uint			count_added = 0;
			uint			count_found = 0;


			Console.Title = "AutoGen: imports from " + File_name;

			if (Parsed_command.verbose)
				{
				Console.WriteLine ($"Procesing {File_name} imports");
				}

			//
			// If the user didn't specify /ALL (all DLLs, including the normally skipped C Run Time Library DLLs) and this DLL is in the skip list,  
			// then we'll skip it
			//

			skip = !Parsed_command.all && is_filename_on_skip_list (File_name);

			if (skip)
				{

				if (Parsed_command.verbose)
					{
					Console.WriteLine ("\t*** Skipping all imports in this DLL ***");
					}

				}
			else
				{

				//
				// Open the executable and get the list of imports
				//

				var pe_hdr = new PeNet.PeFile (File_name);
				var imports = pe_hdr.ImportedFunctions;
				string  cur_dll;
				string  func_name;

				if (pe_hdr.HasValidImportDir && pe_hdr.ImportedFunctions != null)
					{
					cur_dll = string.Empty;

					//
					// Walk the list of imported APIs
					//

					foreach (ImportFunction func in imports)
						{
						bool in_include_dlls = false; ;

						//
						// Output the name of the DLL only when it changes. This assumes that the PeNet library will list the imports sorted by 
						// DLL, which appears to be true
						//

						if (cur_dll != func.DLL)
							{
							cur_dll = func.DLL;

							if (Parsed_command.verbose)
								{
								Console.WriteLine ($"\n{cur_dll}");
								}

							//
							// Did the user specify /INCLUDE_DLLS?
							//

							if (Parsed_command.include_dlls.Count != 0)
								{

								//
								// Is the DLL on the include list?
								//

								foreach (var re in Parsed_command.included_dlls_regex)
									{

									if (re.IsMatch (cur_dll))
										{
										in_include_dlls = true;
										break;
										}
									}

								}
							else
								{
								in_include_dlls = false;
								}

							//
							// If the user didn't specify /ALL (all DLLs) and this DLL is in the skip list, or the user specified /INCLUDE_DLLS and 
							// the DLL isn't on the include list, then we'll skip it
							//

							skip = ((!Parsed_command.all && is_filename_on_skip_list (cur_dll)) || (Parsed_command.include_dlls.Count != 0 && !in_include_dlls));

							if (skip)
								{

								if (Parsed_command.verbose)
									{
									Console.WriteLine ("\t*** Skipping all imports from this DLL ***");
									}

								}
							else
								{

								//
								// If we are recursing, then get the DLL's exports
								//

								if (Parsed_command.recurse)
									{
									get_exports (cur_dll, Parsed_command, ref Api_list);
									}

								}

							}

						//
						// Only Detour imports we're not skipping and that we haven't already looked up from recursing
						//

						if (!skip && !Parsed_command.recurse)
							{

							//
							// Some imports don't have a name, so check if it has one. If it does, then Detour by name
							//

							if (func.Name != null)
								{
								Api_Record api_record = new Api_Record ();

								func_name = func.Name;

								if (Parsed_command.verbose)
									{
									Console.Write ($"\t{func_name}");
									}

								//
								// If this is a C++ mangled ("decorated") name, then unmangle it and display that in parentheses
								//

								if (func.Name.StartsWith ("?"))
									{
									func_name = NativeMethods.undecorate_name (func.Name);

									if (Parsed_command.verbose)
										{
										Console.Write ($" ({func_name})");
										}

									}

								//
								// Is the API in the database?
								//

								if (api_record.lookup_api (Parsed_command.database, func_name))
									{
									count_found++;

									if (Parsed_command.verbose)
										{
										Console.Write (" FOUND");
										}

									}
								else if (Parsed_command.webscrape)
									{

									//
									// Find the help web page for this API
									//

									if (scrape_api_from_web_page (func_name, cur_dll, Parsed_command.verbose, ref api_record))
										{

										//
										// Add the record to the database
										//

										api_record.set_actual_dll (cur_dll);
										api_record.set_time_added (DateTime.Now);
										api_record.add_to_database (Parsed_command.database);
										count_added++;

										if (Parsed_command.verbose)
											{
											Console.Write (" ADDED");
											}

										}
									else
										{

										//
										// Couldn't find the API web page
										//

										continue;
										}

									}
								else
									{

									//
									// The API wasn't in the database and the user specified /NOWEBSCRAPE, so there is nothing else we can do with
									// this API
									//

									if (Parsed_command.verbose)
										{
										Console.WriteLine (" SKIPPED (not in database and /NOWEBSCRAPE)");
										}

									continue;
									}

								//
								// Add this API's details to the Detours that we will make
								//

								Api_list.Add (api_record);
								}
							else
								{

								//
								// The import is not referenced by name; just by its hint
								//

								if (Parsed_command.verbose)
									{
									Console.Write ($"\tNO NAME, Hint = {func.Hint}");
									}

								}

							if (Parsed_command.verbose)
								{
								Console.WriteLine ();
								}

							}

						}   // End foreach imports

					}

				}

			total_added += count_added;
			total_found += count_found;

			if (Parsed_command.verbose)
				{
				Console.WriteLine ($"Imports Added = {count_added}, Found = {count_found}, Total added = {total_added}, Total found = {total_found}");
				}

			}   // End get_imports

		/// <summary>
		/// Determine if the specified file should be skipped
		/// </summary>
		/// <param name="File_name">File name to check</param>
		/// <returns>True if the file is on the skip list</returns>
		private static bool
		is_filename_on_skip_list
			(
			string	File_name
			)
			{
			bool			is_match = false;
			
			//
			// Loop through each of the Regular Expressions in the skip list and see if it matches the file name passed in
			//

			foreach (Regex pattern in skip_dlls)
				{
				MatchCollection matches = pattern.Matches (File_name);

				if (matches.Count != 0)
					{
					is_match = true;
					break;
					}

				}

			return is_match;
			}   // End is_filename_on_skip_list

		/// <summary>
		/// Try to find the documentation web page for the specified API
		/// </summary>
		/// <param name="Api_name">API name to lookup</param>
		/// <param name="Actual_dll">DLL the API appears in</param>
		/// <param name="Doc_page">URL of the API's documentation</param>
		/// <returns>True of the API's doc page was found</returns>
		private static bool
		lookup_api
			(
			string		Api_name,
			string		Actual_dll,
			out string	Doc_page
			)
			{
			bool		found = false;
			string []	simple_searches =
				{
				"+\"" + Api_name + " Function\" " + Actual_dll + " +site:docs.microsoft.com",
				"+\"" + Api_name + " Function\" +site:docs.microsoft.com",
				};

			Doc_page = "";

			//
			// First, try some simple searches
			//

			foreach (string str in simple_searches)
				{

				if (found = search_bing (str, Api_name, out Doc_page))
					{
					break;
					}

				}

			//
			// If we didn't find the page, try some more complex searches
			//

			if (!found)
				{

				//
				// If the API name ends in A (ANSI) or W (Wide; Unicode), then remove it and try again
				//

				if (Api_name.EndsWith ("A") || Api_name.EndsWith ("W"))
					{
					string      base_api_name = Api_name.Substring (0, Api_name.Length - 1);
					string []   more_searches =
						{
						"+\"" + base_api_name + " Function\" " + Actual_dll + " +site:docs.microsoft.com",
						"+\"" + base_api_name + " Function\" +site:docs.microsoft.com",
						};

					foreach (string str in more_searches)
						{

						if (found = search_bing (str, base_api_name, out Doc_page))
							{
							break;
							}

						}

					}

				}

			return found;
			}   // End lookup_api

		/// <summary>
		/// Process the list of files specified on the command line
		/// </summary>
		/// <param name="Parsed_command">Results of command line parse</param>
		private static void
		process_files
			(
			Command_Line_Options	Parsed_command
			)
			{
			List <Api_Record>	api_records = new List <Api_Record> ();
			Api_Record			api_record = new Api_Record ();
			List <Api>			api_list = new List <Api> ();
			List <string>		headers = new List <string> ();

			//
			// Process each of the files on the command line
			//

			foreach (string file in Parsed_command.file_names)
				{

				//
				// We allow wildcard and relative path names on the files, so try to resolve the file name to a list of file names
				//

				var files = find_files (file);

				if (files.Count == 0)
					{
					Console.WriteLine ($"\t*** Couldn't find {file}");
					}
				else
					{

					//
					// Process all the specified files
					//

					foreach (string file_name in files)
						{
						Console.Title = "AutoGen: processing " + file;

						if (string.IsNullOrEmpty (file_name))
							{
							Console.WriteLine ($"\t*** Couldn't find {file_name}");
							}
						else
							{

							//
							// If we are including exports, then get all the exports from this file
							//

							if (Parsed_command.exports)
								{
								get_exports (file_name, Parsed_command, ref api_records);
								}

							//
							// If we are including imports, then get all the imports from this file
							//

							if (Parsed_command.imports)
								{
								get_imports (file_name, Parsed_command, ref api_records);
								}

							}

						}	// End foreach file_name

					}

				}   // End foreach Parsed_command.file_names

			Console.WriteLine ($"Total APIs added = {total_added}, Total APIs found = {total_found}");

			//
			// Are we generating Detours? 
			//

			if (Parsed_command.generate)
				{

				//
				// Sort the list of APIs alphabetically by name
				//

				api_records = api_records.OrderBy (a => a.get_api_name ()).ToList ();

				//
				// Walk the list of Api_Records and parse the function prototype in each one
				//

				foreach (Api_Record api_rec in api_records)
					{

					//
					// Only process functions that are maked as Detourable in the database. Microsoft is horribly inconsistent on how they document
					// and implement (I'm looking at you, GetEnvironmentStrings) their APIs, so many APIs are marked as not being Detourable because 
					// the database is missing some important information needed to implement a Detour. This is just a proof of concept, so we can 
					// skip those APIs for now. To fix this, the database will need to be edited by hand
					//

					if (api_rec.get_detourable ())
						{
						string	prototype = api_rec.get_prototype ();
						string	header = api_rec.get_header ();

						CPP14_Function_Parser	fp = new CPP14_Function_Parser ();

						Api api = fp.do_parse (prototype);
						api.ret_type = api.specifiers [api.ret_type_idx];

						//
						// Remove any extraneous comments from the file name (sometimes, the Microsoft help page annotates the file name)
						//

						int end = header.IndexOf (" ");

						if (end > 0)
							{
							header = header.Substring (0, end);
							}

						api.header = header;
						api_list.Add (api);

						//
						// Add the header file to the list
						//

						if (header != null && header.Length > 0)
							{
							headers.Add (header);
							}

						}
					else
						{
						Console.WriteLine ($"SKIPPING {api_rec.get_api_name ()}");
						}

					}   // End foreach Api_Record

				//
				// Ensure that there aren't any duplicates in the list of header files
				//

				headers.Sort (StringComparer.InvariantCultureIgnoreCase);
				headers = headers.Distinct ().ToList ();

				//
				// Generate the source file containing the Detours
				//

				Code_Gen.create_detours (Parsed_command.output, Parsed_command.file_names, ref api_list, ref headers);
				}

			}   // End process_files

		/// <summary>
		/// This routine will find the help web page on Microsoft's web site for the specified API, and extract the information we want about the API
		/// </summary>
		/// <param name="Api_name">API name to lookup</param>
		/// <returns>True if the API was found</returns>
		static bool
		scrape_api_from_web_page
			(
			in string		Api_name,
			in string		Actual_dll,
			in bool			Verbose,
			ref Api_Record	Record
			)
			{
			bool    found = false;
			string	text;
			string  help_page;

			//
			// Instantiate a web browser
			//

			ScrapingBrowser browser = new ScrapingBrowser ();
			browser.AllowAutoRedirect = true;
			browser.AllowMetaRedirect = true;
			browser.IgnoreCookies = true;

			//
			// Try to find the help page for the API
			//

			if (found = lookup_api (Api_name, Actual_dll, out help_page))
				{
				var results_page = browser.NavigateToPage (new Uri (help_page));
				Record.set_api_name (Api_name);
				Record.set_help_page (help_page);

				//
				// Get a list of the Syntax sections. There should only be one, but this should work if there is more than one (assuming that they are
				// differentiated by language type, e.g. C++ vs VB
				//

				var headers = results_page.Html.CssSelect ("#syntax");

				if (headers.Any ())
					{

					//
					// There should only be one item in the collection
					//

					var item = headers.First ();

					//
					// The Syntax section on the help page contains an HTML div, followed by an HTML pre, which contains an HTML code tag
					//

					var code = results_page.Html.CssSelect ("#main > pre > code").First ();

					//
					// Ensure that this is an HTML code tag that contains C++, or sometimes C
					//

					if (code != null && (code.Name == "code" && code.HasAttributes) && (code.Attributes [0].Value.Contains ("lang-cpp") || 
						code.Attributes [0].Value.Contains ("lang-c++") || code.Attributes [0].Value.Contains ("lang-C++") || 
						code.Attributes [0].Value.Contains ("lang-C")))
						{

						//
						// Get the value of the code tag, which is the function definition
						//

						text = code.InnerText.Replace ('\n', ' ').Replace ("  ", " ").Trim ();
						Record.set_prototype (text);

						if (Verbose)
							{
							Console.WriteLine ($"\nFunction prototype:\n{text}");
							}

						}
					else
						{

						//
						// This page is not built the way we expect or we couldn't find an exact match
						//

						Console.WriteLine ("\n**** C++ function definition not first in Syntax section, on page {0}\n", results_page.AbsoluteUrl);
						found = false;
						goto done;
						}

					//
					// Find the Requirements section, so we can get the header file, library, and DLL in the table
					//

					headers = results_page.Html.CssSelect ("#requirements");

					if (headers.Any ())
						{
						Record.set_undocumented_api (false);

						//
						// There should only be one item in the collection
						//

						item = headers.First ();
						string  header_file;
						string  library_file;
						string  dll_file;

						//
						// The Requirements section on the help page contains an HTML div, followed by an HTML table, which contains an HTML tbody and
						// rows of HTML tr, each containing two HTML tb (row heading, and data)
						//

						var div = item.NextSibling;
						var table =  div.NextSibling;
						var tbody = table.Descendants ("tbody");
						var rows = tbody.CssSelect ("tr").ToArray ();

						//
						// Find the Header row and extract the data from the second column
						//

						var header_row = rows.CssSelect ("td").Where (r => r.InnerText.Equals ("Header")).Select (n => n.ParentNode);
						var h = header_row.CssSelect ("td");

						if (h.Any ())
							{
							header_file = h.ElementAt (1).InnerText.Trim ();
							}
						else
							{
							header_file = "";
							}

						Record.set_header (header_file);

						if (Verbose)
							{
							Console.WriteLine ("Header:\t{0}", header_file);
							}

						//
						// Find the Library row and extract the data from the second column
						//

						var library_row = rows.CssSelect ("td").Where (r => r.InnerText.Equals ("Library")).Select (n => n.ParentNode);
						var l = library_row.CssSelect ("td");

						if (l.Any ())
							{
							library_file = l.ElementAt (1).InnerText.Trim ();
							}
						else
							{
							library_file = "";
							}

						Record.set_library (library_file);

						if (Verbose)
							{
							Console.WriteLine ("Lib:\t{0}", library_file);
							}

						//
						// Find the DLL row and extract the data from the second column
						//

						var dll_row = rows.CssSelect ("td").Where (r => r.InnerText.Equals ("DLL")).Select (n => n.ParentNode);
						var d = dll_row.CssSelect ("td");

						if (d.Any ())
							{
							dll_file = d.ElementAt (1).InnerText.Trim ();
							}
						else
							{
							dll_file = "";
							}

						Record.set_documented_dll (dll_file);

						if (Verbose)
							{
							Console.WriteLine ("DLL:\t{0}", dll_file);
							}

						Record.is_valid = true;
						}
					else
						{

						//
						// This page is not built the way we expect
						//

						Console.WriteLine ("\n**** Couldn't find Requirements section on page {0}\n", results_page.AbsoluteUrl);
						found = false;
						}


					}
				else
					{

					//
					// This page is not built the way we expect
					//

					Console.WriteLine ("\n**** Couldn't find Syntax section on page {0}\n", results_page.AbsoluteUrl);
					found = false;
					}

				}

done:
			//
			// If there was any kind of error, add an "undocumented API" entry to the database
			//

			if (!found)
				{

				//
				// This API is not documented (at least in a form that we can understand), so fill in what we can
				//

				Record.set_api_name (Api_name);
				Record.set_prototype ("");
				Record.set_header ("");
				Record.set_library ("");
				Record.set_actual_dll (Actual_dll);
				Record.set_documented_dll ("");
				Record.set_automated_add (true);
				Record.set_help_page ("");
				Record.set_undocumented_api (true);
				Record.set_detourable (false);
				Record.is_valid = true;
				found = true;

				if (Verbose)
					{
					Console.Write (" *** UNDOCUMENTED *** ");
					}

				}

			return found;
			}   // End scrape_api_from_web_page

		/// <summary>
		/// Use Bing to find the API's documentation page. Both Google and Bing will throttle the number of search requests that can be performed
		/// per hour. Bing allows more, so that's what we'll use. You will need to look at the documentation on ScrapySharp to understand the CSS
		/// selector format
		/// </summary>
		/// <param name="Search_string">Query string to pass to the search engine</param>
		/// <param name="Api_name">The name of the API that we're looking for</param>
		/// <param name="Doc_page">URL of the API's documentation page</param>
		/// <returns>True if the API's doc page was found</returns>
		private static bool
		search_bing
			(
			string		Search_string,
			string		Api_name,
			out string	Doc_page
			)
			{
			bool		found = false;

			Doc_page = "";

			//
			// Create a web browser instance
			//

			ScrapingBrowser browser = new ScrapingBrowser ();
			browser.AllowAutoRedirect = true;
			browser.AllowMetaRedirect = true;
			browser.IgnoreCookies = true;

#if Google
			//
			// Looking at the HTML for google.com, I find that the search form is named 'tsf' ("The Search Form"?), so find that on the page
			//

			WebPage         search_engine = browser.NavigateToPage (new Uri ("https://www.Google.com/"));
			PageWebForm     form = search_engine.FindFormById ("tsf");

			//
			// The input box name on the form is named 'q'. Use that to submit the query for the API name
			//

			form ["q"] = "+\"" + Api_name + " Function\" site:docs.Microsoft.com";
			form.Method = HttpVerb.Get;
			WebPage     results_page = form.Submit ();
#else
			//
			// Ask Bing to search. Unlike Google, Bing doesn't limit queries to ~100/hour, but Bing will refuse a query after a while. So, try up to
			// 10 times with 1 second between retries. This seems to work without problems on 2019-10-14
			//
			// TODO: Use asynch-await for network access
			//

			WebPage results_page = Retry.attempt (() => browser.NavigateToPage (new Uri ("https://www.bing.com/search?q=" + Search_string)), TimeSpan.FromSeconds (1), 10);
#endif
			//
			// Not all Win32 APIs are documented. Sigh. Check the page for that indication
			//

			if (!results_page.Html.InnerText.Contains ("There are no results for") && results_page.Html.InnerText.Contains (Api_name))
				{

				//
				// We didn't get a negative. Get the list of links to the pages it returned
				//

				var links = results_page.Html.CssSelect ("#b_results > li > h2 > a").ToArray ();

				foreach (HtmlNode page in links)
					{

					//
					// Look at each link and see if it starts with the name of the API. If so, that probably is the one we want
					//

					if (page.InnerText.StartsWith (Api_name))
						{
						Doc_page = page.Attributes [0].Value;
						found = true;
						break;
						}

					}   // End foreach links

				}

			return found;
			}   // End Search_bing

		/// <summary>
		/// Convert a string containing Windows-style wildcard characters (?*) to a regular expression
		/// </summary>
		/// <param name="Wildcard">String containing Windows wildcard characters</param>
		/// <returns>Equivalent regular expression</returns>
		public static string
		wildcard_to_regexp 
			(
			string	Wildcard
			)
			{
			string	reg_exp = "^" + Regex.Escape (Wildcard).Replace ("\\?", ".").Replace ("\\*", ".*") + "$";
			return reg_exp;
			}   // End wildcard_to_regexp

		}   // End class Program

	/// <summary>
	/// Class for working with the API database
	/// </summary>
	class Api_Record
		{
		private const string    api_field               = "@API";
		private const string    prototype_field         = "@Prototype";
		private const string    header_field            = "@Header";
		private const string    library_field           = "@Library";
		private const string    actual_dll_field        = "@Actual_DLL";
		private const string    documented_dll_field    = "@Documented_DLL";
		private const string    automated_add_field     = "@Automated_add";
		private const string    time_added_field        = "@Time_added";
		private const string    help_page_field         = "@Help_page";
		private const string    undocumented_api_field	= "@Undocumented_API";
		private const string	detourable_field		= "@Detourable";

		private Dictionary <string, object> record;

		public
		Api_Record ()
			{

			//
			// Create and initialize a new instance
			//

			record = new Dictionary <string, object> ()
				{
					{api_field,					null},
					{prototype_field,			null},
					{header_field,				null},
					{library_field,				null},
					{actual_dll_field,			null},
					{documented_dll_field,		null},
					{automated_add_field,		true},
					{time_added_field,			null},
					{help_page_field,			null},
					{undocumented_api_field,	false},
					{detourable_field,			false}
				};

			}   // End Api_Record constructor

		public bool is_valid { get; set; }
		public string get_api_name () { return record [api_field].ToString (); }
		public string get_prototype () { return record [prototype_field].ToString (); }
		public string get_header () { return record [header_field].ToString (); }
		public string get_library () { return record [library_field].ToString (); }
		public string get_actual_dll () { return record [actual_dll_field].ToString (); }
		public string get_documented_dll () { return record [documented_dll_field].ToString (); }
		public bool get_automated_add () { return (bool) record [automated_add_field]; }
		public DateTime get_time_added () { return (DateTime) record [time_added_field]; }
		public string get_help_page () { return record [help_page_field].ToString (); }
		public bool get_undocumented_api () { return (bool) record [undocumented_api_field]; }
		public bool get_detourable () { return (bool) record [detourable_field]; }
		public void set_api_name (string Api) { record [api_field] = Api; }
		public void set_prototype (string Prototype) { record [prototype_field] = Prototype; }
		public void set_header (string Header) { record [header_field] = Header; }
		public void set_library (string Library) { record [library_field] = Library; }
		public void set_actual_dll (string Dll) { record [actual_dll_field] = Dll; }
		public void set_documented_dll (string Dll) { record [documented_dll_field] = Dll; }
		public void set_automated_add (bool Automated_add) { record [automated_add_field] = Automated_add; }
		public void set_time_added (DateTime Time_added) { record [time_added_field] = Time_added.ToString (); }
		public void set_help_page (string Help_page) { record [help_page_field] = Help_page; }
		public void set_undocumented_api (bool Undocumented_api) { record [undocumented_api_field] = Undocumented_api; }
		public void set_detourable (bool Detourable) { record [detourable_field] = Detourable; }

		/// <summary>
		/// Add the current record to the database
		/// </summary>
		public void
		add_to_database 
			(
			string	Database
			)
			{
			string  insert_sql = "INSERT INTO API_data " +
				"(API, Prototype, Header, Library, Actual_DLL, Documented_DLL, Automated_add, Time_added, Help_page, Undocumented_API, Detourable)" +
				" VALUES (@API, @Prototype, @Header, @Library, @Actual_DLL, @Documented_DLL, @Automated_add, @Time_added, @Help_page," +
				"@Undocumented_API, @Detourable)";

			if (is_valid)
				{
				DB_Access.execute_non_query (Database, insert_sql, record, CommandType.Text);
				}
			else
				{
				throw new ArgumentException ("Record not valid");
				}

			}   // End add_to_database

		/// <summary>
		/// Look in the database for the specified API name
		/// </summary>
		/// <param name="Api_name">API to lookup</param>
		/// <returns>True if the API was found in the database</returns>
		public bool
		lookup_api
			(
			string Database,
			in string Api_name
			)
			{
			bool                            found = false;
			string                          query_sql = "SELECT * FROM API_data WHERE API = @API";
			Dictionary <string, object>     query_params = new Dictionary <string, object> ()
				{
					{"@API", Api_name}
				};


			using (var existing_record = DB_Access.get_table_from_query (Database, query_sql, query_params, CommandType.Text))
				{

				//
				// Was the API in the database?
				//

				if (existing_record.Rows.Count == 1)
					{

					//
					// Copy the data from the row into the record
					//

					foreach (DataColumn col in existing_record.Columns)
						{
						record ["@" + col] = existing_record.Rows [0].ItemArray [col.Ordinal];
						}

					is_valid = true;
					found = true;
					}

				}
			return found;
			}   // End lookup_api

		/// <summary>
		/// Update an entry in the database
		/// </summary>
		public int
		update_entry 
			(
			string	Database
			)
			{
			int     rows_affected = 0;
			string  update_sql = "UPDATE API_data SET Prototype = @Prototype, Header = @Header, Library = @Library, Actual_DLL = @Actual_DLL, " +
				"Documented_DLL = @Documented_DLL, Automated_add = @Automated_add, Time_added = @Time_added, Help_page = @Help_page" +
				"Undocumented_API = @Undocumented_API, Detourable = @Detourable " +
				"WHERE API = @API";

			if (is_valid)
				{
				rows_affected = DB_Access.execute_non_query (Database, update_sql, record, CommandType.Text);
				}
			else
				{
				throw new ArgumentException ("Record not valid");
				}

			return rows_affected;
			}   // End update_entry

		}   // End class api_record

	[Serializable ()]
	public class Website_not_found : System.Exception
		{
		public
		Website_not_found 
			() : base () { }

		public 
		Website_not_found 
			(
			string Message
			) : base (Message) { }

		public 
		Website_not_found 
			(
			string				Message, 
			System.Exception	Inner
			) : base (Message, Inner) { }

		//
		// A constructor is needed for serialization when an exception propagates from a remoting server to the client
		//

		protected 
		Website_not_found 
			(
			System.Runtime.Serialization.SerializationInfo	Info,
			System.Runtime.Serialization.StreamingContext	Context) : base (Info, Context) { }

		}	// End class Website_not_found

	/// <summary>
	/// Wrappers around Win32 APIs
	/// </summary>
	public static class NativeMethods
		{
		enum Undecorated_Flags
			{
			UNDNAME_COMPLETE                = 0x0000,
			UNDNAME_NAME_ONLY				= 0x1000
			}

		/// <summary>
		/// Undecorates the specified decorated C++ symbol name
		/// </summary>
		/// <param name="Decorated_name">The decorated C++ symbol name</param>
		/// <param name="Undecorated_name">A pointer to a string buffer that receives the undecorated name</param>
		/// <param name="Undecorated_length">The size of the UnDecoratedName buffer, in characters</param>
		/// <param name="Flags">The options for how the decorated name is undecorated</param>
		/// <returns>If the function succeeds, the return value is the number of characters in the UnDecoratedName buffer, not including the NULL terminator</returns>
		[DllImport ("DbgHelp.dll", SetLastError = true, PreserveSig = true, BestFitMapping = false)]
		private static extern int
		UnDecorateSymbolName
			(
			[In]  [MarshalAs (UnmanagedType.LPStr)]     string				Decorated_name,
			[Out]                                       StringBuilder		Undecorated_name,
			[In]  [MarshalAs (UnmanagedType.U4)]        int					Undecorated_length,
			[In]  [MarshalAs (UnmanagedType.U4)]        Undecorated_Flags	Flags
			);

		private const int               max_symbol_name_length = 2000;
		private static StringBuilder    undec_str_bldr = new StringBuilder (max_symbol_name_length);

		/// <summary>
		/// Use DbgHelp to convert a C++ mangled ("decorated") name to the real routine name
		/// </summary>
		/// <param name="Name">The decorated C++ symbol name</param>
		/// <returns>The undecorated name</returns>
		public static string
		undecorate_name
			(
			string Name
			)
			{
			string  ret_val;

			if (NativeMethods.UnDecorateSymbolName (Name, undec_str_bldr, undec_str_bldr.Capacity, Undecorated_Flags.UNDNAME_NAME_ONLY) > 0)
				{
				ret_val = undec_str_bldr.ToString ();
				}
			else
				{
				ret_val = Name;
				}

			return ret_val;
			}   // End undecorate_name

		}   // End class NativeMethods

	/// <summary>
	/// Retry wrapper to permit rerying a call a specified number of times
	/// TODO: use asynch-await
	/// May be used like this:
	///		Retry.attempt (() => some_function_that_can_fail (), TimeSpan.FromSeconds (1)));
	///		Retry.attempt (some_function_that_can_fail, TimeSpan.FromSeconds (1));
	///		int result = Retry.attempt (some_function_that_returns_int, TimeSpan.FromSeconds (1), 10);
	/// </summary>
	public static class Retry
		{
		public static void
		attempt 
			(
			Action		Action,
			TimeSpan	Retry_interval,
			int			Max_attempts = 10)
			{
			attempt <object> (() =>
				{
				Action ();
				return null;
				}, Retry_interval, Max_attempts);
			}	// End attempt

		public static T 
		attempt <T> 
			(
			Func <T>	Action,
			TimeSpan	Retry_interval,
			int			Max_attempts = 10)
			{
			var exceptions = new List <Exception> ();

			for (int attempted = 0; attempted < Max_attempts; attempted++)
				{
				try
					{

					if (attempted > 0)
						{
						Thread.Sleep (Retry_interval);
						}

					return Action ();
					}
				catch (Exception ex)
					{
					exceptions.Add (ex);
					}

				}

			throw new AggregateException (exceptions);
			}	// End attempt

		}   // End class Retry

	}   // End namespace FDI.AutoGen
