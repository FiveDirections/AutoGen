//
// FACILITY:	CLI_Parser - Command Line Interpreter parser
//
// DESCRIPTION:	This module contains the routines for parsing the AutoGen command line. The command line grammar is described in CLI.g4, which is 
//				then processed by ANTLR4 (www.antlr.org) to generate the parsing code, which is placed in the folder named "generated". When this 
//				project is built, the generated files are created automatically using a custom build event.
//
//				The CLI language is very sophisticated, and supports abbreviation, case insensitivity, multi-valued parameters, switch negation,  
//				wildcard file names, and multiple switch characters ("/" or "-"). See the help text, below, for more information
//
//				TODO:
//					The parser could be smarter so that fewer characters need to be in doulbe-quotes
//					It would be nice to have positional qualifiers, i.e. they affect a particular input file. Right now, all qualifiers are global
//					and affect all input files
//
// VERSION:		1.1
//
// AUTHOR:		Brian Catlin
//
// CREATED:		2019-11-18
//
// MODIFICATION HISTORY:
//
//	1.1		2020-03-09	Brian Catlin
//			Fix bug introduced by the FILE_NAME grammar rule that caused qualifiers starting with a hyphen ('-') to not be recognized
//			As a result, file names containing a hyphen must now be double-quoted, e.g. /INCLUDE_DLLS="api-ms-win-core-string-*.dll" 
//			Added /? and -? as aliases for /HELP
//			If /VERBOSE is specified, output the results of the command line parse
//			Support relative file path for @script
//			General cleanup before release
//
//	1.0		2019-11-18	Brian Catlin
//			Original version
//
//
// System namespaces
//

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;

//
// Third-party NuGet namespaces
//

using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;


namespace FDI.AutoGen
	{

	/// <summary>
	/// Command Line Parser
	/// </summary>
	class Command_Parser
		{

		/// <summary>
		/// Parse the specified command string, validate the qualifiers, combinations of qualifiers, parameters, and set any default values
		/// </summary>
		/// <param name="Command">Command string</param>
		/// <returns></returns>
		static public Command_Line_Options
		do_parse 
			(
			string	Command
			)
			{
			Command_Line_Options parsed_command;

			//
			// Declare the various streams of characters and tokens for parsing the input
			//

			var input_stream = new AntlrInputStream (Command);	// Create a stream that reads from the command line
			var lexer = new CLILexer (input_stream);			// Create a lexer that feeds off of the input stream
			var tokens = new CommonTokenStream (lexer);			// Create a buffer of tokens pulled from the lexer
			var parser = new CLIParser (tokens);				// Create a parser that feeds off of the token buffer
			var tree = parser.start ();							// Call the start rule in the grammar to build a parse tree from the input
			var my_listeners = new CLI_Listener_Overrides ();   // Instantiate my listener override functions so they can be used by ParseTreeWalker

			//
			// Walk the parse tree and call all the listeners
			//

			ParseTreeWalker.Default.Walk (my_listeners, tree);

			//
			// Complex command strings may be placed in a script file and referenced using the "@file.txt" syntax. If a script file was specified, 
			// then parse the contents of the file
			//

			if (my_listeners.parsed_command_line.script_file.Length != 0)
				{
				List <string>	script_file = Program.find_files (my_listeners.parsed_command_line.script_file);

				parsed_command = Command_Parser.do_parse (File.ReadAllText (script_file.First ()));
				}
			else
				{
				parsed_command = my_listeners.parsed_command_line;
				}

			//
			// /HELP shouldn't be specified with any other qualifiers or input files
			//

			if (parsed_command.help && (parsed_command.all || parsed_command.exclude_dlls.Count != 0 || parsed_command.exports || parsed_command.file_names.Count != 0 
				|| parsed_command.imports || parsed_command.output.Length != 0 || parsed_command.recurse))
				{
				throw new ArgumentException ("/HELP is not valid with any other qualifiers or input file(s)");
				}

			//
			// All other command formats require input file(s)
			//

			if (parsed_command.file_names.Count == 0 && !parsed_command.help)
				{
				throw new ArgumentException ("Input file(s) not specified; try /HELP for more info");
				}

			//
			// /EXCLUDE_DLLS is not compatible with /INCLUDE_DLLS
			//

			if (parsed_command.exclude_dlls.Count != 0 && parsed_command.include_dlls.Count != 0)
				{
				throw new ArgumentException ("/EXCLUDE_DLLS and /INCLUDE_DLLS are mutually exclusive; try /HELP for more info");
				}

			//
			// Ensure that either /EXPORTS or /IMPORTS (or both) was specified, when /HELP isn't specified
			//

			if (!parsed_command.help && (!parsed_command.exports && !parsed_command.imports))
				{
				throw new ArgumentException ("/EXPORTS or /IMPORTS (or both) must be specified; try /HELP for more info");
				}

			//
			// Ensure that if /OUTPUT is specified, that /GENERATE is also specified
			//

			if (parsed_command.output.Length != 0 && !parsed_command.generate)
				{
				throw new ArgumentException ("/OUTPUT requires that /GENERATE also be specified; try /HELP for more info");
				}

			//
			// If /EXCLUDE_DLLS was specified, then convert the list of files (they may contain wildcards) to regular expressions.
			// The regular expressions are compiled, because the comparison will typically happen frequently
			//

			if (parsed_command.exclude_dlls.Count != 0)
				{
				parsed_command.exclude_dlls.Distinct ().ToList ();  // Ensure there aren't any duplicates

				var regex_list = new List <Regex> ();

				//
				// Look at each file name specified
				//

				foreach (string name in parsed_command.exclude_dlls)
					{
					var path = Path.GetDirectoryName (name);

					//
					// Ensure that there isn't a path on the file name
					//

					if (path.Length == 0)
						{
						regex_list.Add (new Regex (Program.wildcard_to_regexp (name), RegexOptions.IgnoreCase | RegexOptions.Compiled));
						}
					else
						{
						throw new ArgumentException ("Path not allowed on /EXCLUDE_DLLS file names; try /HELP for more info");
						}

					}

				parsed_command.excluded_dlls_regex = regex_list;
				}

			//
			// If /INCLUDE_DLLS was specified, then convert the list of files (they may contain wildcards) to regular expressions.
			// The regular expressions are compiled, because the comparison will typically happen frequently
			//

			if (parsed_command.include_dlls.Count != 0)
				{
				parsed_command.include_dlls.Distinct ().ToList ();  // Ensure there aren't any duplicates

				var regex_list = new List <Regex> ();

				//
				// Look at each file name specified
				//

				foreach (string name in parsed_command.include_dlls)
					{
					var path = Path.GetDirectoryName (name);

					//
					// Ensure that there isn't a path on the file name
					//

					if (path.Length == 0)
						{
						regex_list.Add (new Regex (Program.wildcard_to_regexp (name), RegexOptions.IgnoreCase | RegexOptions.Compiled));
						}
					else
						{
						throw new ArgumentException ($"Path not allowed on /INCLUDE_DLLS file name {name}; try /HELP for more info");
						}

					}

				parsed_command.included_dlls_regex = regex_list;
				}

			//
			// If /DATABASE was not specified, then set the default
			//

			if (parsed_command.database.Length == 0)
				{
				var path = Path.GetFullPath (".");
				parsed_command.database = Path.Combine (path, "Win32API.accdb");
				}
			else
				{

				//
				// Take the specified database file/path, which may contain relative paths, and convert it to an absolute path
				//

				var path = Path.GetFullPath (parsed_command.database);

				//
				// If a directory was specified but not a database file, then set the database file name to the default
				//

				var file_attrs = File.GetAttributes (path);

				if ((file_attrs & FileAttributes.Directory) != 0)
					{
					path = Path.Combine (path, "Win32API.accdb");
					}

				parsed_command.database = path;
				}


			//
			// If /OUTPUT was not specified, then set the default
			//

			if (parsed_command.output.Length == 0)
				{
				parsed_command.output = "TraceAPI.cpp";
				}
			else
				{

				//
				// Take the specified output file/path, which may contain relative paths, and convert it to an absolute path
				//

				var path = Path.GetFullPath (parsed_command.output);

				//
				// If a directory was specified but not an output file, then set the output file name to the default
				//

				var file_attrs = File.GetAttributes (path);

				if ((file_attrs & FileAttributes.Directory) != 0)
					{
					path = Path.Combine (path, "TraceAPI.cpp");
					}

				parsed_command.output = path;
				}

			//
			// Display the results of the parse
			//

			if (parsed_command.verbose)
				{
				Console.WriteLine ($"Command line: {Command}");
				Console.WriteLine ($"All:\t\t{parsed_command.all}");
				Console.WriteLine ($"Database:\t{parsed_command.database}");
				Console.WriteLine ($"Exclude_dlls:\t{string.Join (", ", parsed_command.exclude_dlls)}");
				Console.WriteLine ($"Exports:\t{parsed_command.exports}");
				Console.WriteLine ($"Generate:\t{parsed_command.generate}");
				Console.WriteLine ($"Help:\t\t{parsed_command.help}");
				Console.WriteLine ($"Imports:\t{parsed_command.imports}");
				Console.WriteLine ($"Include_dlls:\t{string.Join (", ", parsed_command.include_dlls)}");
				Console.WriteLine ($"Output:\t\t{parsed_command.output}");
				Console.WriteLine ($"Recurse:\t{parsed_command.recurse}");
				Console.WriteLine ($"Verbose:\t{parsed_command.verbose}");
				Console.WriteLine ($"Webscrape:\t{parsed_command.webscrape}");
				Console.WriteLine ($"Input files:\t{string.Join (", ", parsed_command.file_names)}");
				Console.WriteLine ();
				}

			return parsed_command;
			}   // End parse

		public static void
		output_help ()
			{

			//
			// Write all the help text to the console
			//

			Console.WriteLine (help_text);
			}   // End output_help

		static readonly string help_text = @"
ABOUT
AutoGen generates Detours for imports or exports in one or more input files.
The resulting C++ file can be added to the TraceAPI project and built to generate
a Detours DLL that can either be injected into a running process (using the
InjectDLL tool) or inserted into a process when it is started (using the WithDLL
tool). All qualifiers are global and apply to all input file(s).


SYNTAX

	Autogen [qualifier]* [input_file]+ [qualifier]*
	AutoGen /HELP

In the above example, '*' means ""zero or more"" and '+' means ""one or more"",
so it doesn't matter if the input file(s) come first or the qualifier(s) come
first. Qualifiers may be before and/or after the list of input files. If more 
than one input file is specified, then the files must be separated by spaces
and grouped together, e.g., AutoGen /imp file1.exe file2.exe /v, or 
AutoGen /imp /v file1.exe file2.exe or AutoGen file1.exe file2.exe /imp /v. 


INPUT FILE(S)
One or more input files may be specified, and they must be valid PE/COFF files
(.EXE, .DLL, .CPL, .OCX, etc). A single Detours output file will be generated
for the entire set of input files. The input file name may contain the standard
Windows wildcard characters ('*' and '?'). Path names may not have a wildcard.
Input files are separated by whitespace, not commas (',').


DEFAULT PATHS
For input file names without a path, AutoGen will search the following 
directories for the file (%WINDIR% is usually C:\Windows):
	Current directory
	%WINDIR%\
	%WINDIR%\System32
	%WINDIR%\System32\Downlevel
	%WINDIR%\SysWow64

When one or more file names are found in one of the default directories, AutoGen
will not search any remaining default paths. Thus, if you specify an input file
of 'Notepad.exe' (without a path), AutoGen will find it in C:\Windows. Likewise,
if you specify /INCLUDE_DLLS=KERNEL32.DLL, AutoGen will find it in 
C:\Windows\System32 and stop looking (it will not also find the 32-bit version in 
C:\Windows\SysWow64).


QUOTING RULES
If any file name or path that includes the following characters '-()=,@!', then 
the entire string must be inside double-quotes, e.g. ""File(1).dll"", or
""C:\Program Files\XYZ\a.exe"", or ""file!.exe"", or ""ab-cd.exe"" (because
'-' can be used a a qualifier switch, like '/', it must be double-quoted when
used in file name).


CASE SENSITIVITY
All qualifiers are case-insensitive; upper-case, lower-case, or a combination
of the two is acceptable, e.g. /all, /ALL, /All are equivalent.


ABBREVIATION
All qualifiers may be abbreviated to any degree, as long as they remain unique.
For example, /EXCLUDE_DLLS and /EXPORTS have the first two characters in common,
so you must supply at least the first three characters of these qualifiers to
prevent ambiguity, e.g. /EXC and /EXP. Qualifiers that do not share their  
beginning sequence in common may be abbreviated to a single character, e.g. /H 
or /V.


SWITCH CHARACTER
The start character for all qualifiers may be either '/' or '-', e.g. -help
and /help are equivalent.


MULTIPLE PARAMETERS
Commands that take one or more parameters, e.g. /EXCLUDE_DLLS may specify a
single parameter using an assignment character ('=' or ':'), e.g.
/EXCLUDE_DLLS=KERNEL32.DLL. When more than one parameter is specified, then the
parameters must be enclosed in parentheses and each parameter separated with a
comma (','), e.g. /EXCLUDE_DLLS=(USER32.DLL,GDI32.DLL).


WHITESPACE
Whitespace may appear before or after punctuation characters (',=:()'), and is not 
significant unless the file name is enclosed in double-quotes, e.g. 
""a file with spaces.txt"".


COMMENTS
The comment character is the '!' (exclamation point).  Everything from the '!'
to the end of the line is ignored.  Comments may be placed on a line with a 
command or on their own line.  Comments are very useful for documenting AutoGen 
scripts.


SHELL INTERACTION and SCRIPTING
CMD.EXE and PowerShell each have their own method for parsing command lines, and
valid AutoGen commands may be misinterpreted by them. AutoGen commands may be
placed in a text file (along with comments) and the text file may be presented
to AutoGen as a script using the '@' command, e.g. @..\script.txt. In a script
file, qualifiers may be on multiple lines because the entire script is read and
passed to the parser.


QUALIFIERS

/ALL
	Do not skip CRTL DLLs. Normally, all routines in the various C Run-Time
	Libraries are not Detourable.

/DATABASE=file.accdb
	Path to the Access database used to remember API definitions. The default is
	Win32API.accdb in the current directory. If only a path is specified, then 
	the default file name will be appended to the path.

/EXCLUDE_DLLS=file.dll
/EXCLUDE_DLLS=(file1.dll, file2.dll [,filen.dll]...)
	Do not process any routines in any of the specified DLLs. All other DLLs
	will be processed. Do not include any path information with the file name
	(executables don't include path information for their DLL imports). Wild
	card characters ('*?') are allowed.

/EXPORTS
	Process exported routines from the specified input files. Typically, this
	qualifier is used when the input files are DLLs. May also be used with
	/IMPORTS.

/GENERATE (default)
/NOGENERATE
	By default, AutoGen will generate a .CPP output file; however, in some
	circumstances you may not want to generate a file, such as when you just
	want to build the API database, in which case you would specify the
	/NOGENERATE qualifier. It is not necessary to specify the /GENERATE qualifier
	because it is the default. If both are specified, then the last one to be
	parsed will take precedence. /NOGENERATE is usually used with /IMPORTS to 
	add all APIs in a set of DLLs the database.

/HELP /?
	Displays this text.

/IMPORTS
	Process imported routines from the specified input files. Typically, this
	qualifier is used when the input files are EXEs, but may also be used with
	DLLs. May also be used with /EXPORTS.

/INCLUDE_DLLS=file.dll
/INCLUDE_DLLS=(file1.dll,file2.dll [, filen.dll]...)
	Only process routines found in the specified DLLs. This allows you to limit
	the routines to be processed to just the DLLs you care about. Do not include
	any path information with the file name (executables don't include path 
	information for their DLL imports). Wild card characters ('*?') are allowed.

/OUTPUT=file.cpp
	The default output file is TraceApi.cpp, but may be overridden with this
	qualifier. If only a path is specified, then the default file name will be
	appended to the path.

/RECURSE
	Opens each imported DLL that is encountered and processes all of its exports
	(and all of its children). Used to ensure that all DLLs and their dependencies 
	are processed.

/VERBOSE
	Writes status information to the console.

/WEBSCRAPE (default)
/NOWEBSCRAPE
	By default, when an imported or exported routine is not found in the database,
	AutoGen will attempt to find the routine definition on Microsoft's web site.
	By specifying /NOWEBSCRAPE, AutoGen will not perform a web search for routines
	not in the database. It is not necessary to specify the /WEBSCRAPE qualifier
	because it is the default. If both are specified, then the last one to be
	parsed will take precedence.


EXAMPLES
	AutoGen /IMPORTS /INCLUDE_DLLS=kernel32.dll taskmgr.exe hh.exe
	AutoGen /imp /inc=kernel32.dll taskmgr.exe hh.exe

Create Detours for APIs that are imported by either EXE from KERNEL32.DLL. 
The output file will be TraceAPI.cpp in the current directory.

	AutoGen /EXPORTS /NOGENERATE kernel32.dll
	AutoGen /exp /nogen kernel32.dll

Lookup all APIs exported by C:\WINDOWS\SYSTEM32\KERNEL32.DLL and add them to
the database.

	AutoGen /EXPORTS /IMPORTS /RECURSE notepad.exe
	AutoGen /exp /imp /rec notepad.exe

Lookup all APIs imported by C:\WINDOWS\NOTEPAD.EXE as well as all APIs imported
by any DLL that is imported by NOTEPAD.EXE. The APIs are added to the database
and no output file is generated.

	AutoGen /IMPORTS /INCLUDE_DLLS=kernel32.dll taskmgr.exe /NOWEBSCRAPE
	AutoGen /imp /inc=kernel32.dll taskmgr.exe /noweb

Create Detours for all APIs imported by C:\WINDOWS\SYSTEM32\TASKMGR.EXE that
are located in C:\WINDOWS\SYSTEM32\KERNEL32.DLL, but only if the APIs are already
in the database.  The output file will be TraceAPI.cpp in the current directory.

	AutoGen /IMPORTS /INCLUDE_DLLS=kernel*.dll taskmgr.exe /OUTPUT=taskmgr.cpp
	AutoGen /imp /inc=kernel*.dll taskmgr.exe /out=taskmgr.cpp

Create Detours for all APIs imported by C:\WINDOWS\SYSTEM32\TASKMGR.EXE that
are located in any DLL that begins with kernel* in directories specified in the 
section DEFAULT PATHS. The output file will be taskmgr.cpp in the current directory.

";  // Help text

		#region CLI_Listener_Overrides
		/// <summary>
		/// This class contains routines that are called by the ANTLR tree walker to update the parsed state that is stored in parsed_command_line
		/// The names of the routines follow from the grammar rule names and the when the parser is processing a branch of the parse tree (e.g.
		/// Start or Exit)
		/// </summary>
		class CLI_Listener_Overrides : CLIBaseListener
			{
			public Command_Line_Options	parsed_command_line = new Command_Line_Options ();

			//
			// Many qualifiers take a list of file names (separated by commas), and the file_list grammar rule places the names in this list
			//

			List <string>				_file_list;

			//
			// Many qualifiers take a file name as a parameter, and the file grammar rule places the file name into the _file member variable
			//

			string _file;


			/// <summary>
			/// If /ALL was specified, then record that
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void
			ExitAll_qual 
				(
				[NotNull] CLIParser.All_qualContext	Context
				)
				{
				parsed_command_line.all = true;
				}   // End ExitAll_qual

			/// <summary>
			/// If /DATABASE=filename was specified, then save the file name
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void
			ExitDatabase_qual 
				(
				[NotNull] CLIParser.Database_qualContext	Context)
				{
				parsed_command_line.database = _file;
				_file = null;
				}   // End ExitDatabase_qual

			/// <summary>
			/// If /EXCLUDE_DLLS was specified, then it may have one or more file names associated with it. Add all the file names to the list of
			/// DLLs that should be excluded
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void
			ExitExclude_dlls_qual 
				(
				[NotNull] CLIParser.Exclude_dlls_qualContext	Context
				)
				{

				//
				// Get either the file name or the list of file names
				//

				if (_file != null)
					{
					parsed_command_line.exclude_dlls.Add (_file);
					_file = null;
					}
				else
					{
					parsed_command_line.exclude_dlls = _file_list;
					_file_list = null;
					}

				}   // End ExitExclude_dll_qual

			/// <summary>
			/// If /EXPORTS was specified, then record that
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void
			ExitExports_qual 
				(
				[NotNull] CLIParser.Exports_qualContext	Context
				)
				{
				parsed_command_line.exports = true;
				}   // End ExitExports_qual

			/// <summary>
			/// This saves the value of a file name to the _file member variable. This grammar rule is used by many other rules
			/// </summary>
			/// <param name="Context">ANTLR parse context</param>
			public override void
			ExitFile 
				(
				[NotNull] CLIParser.FileContext	Context
				)
				{
				_file = Context.GetText ();

				if (_file.StartsWith ("\"") && _file.EndsWith ("\""))
					{
					_file = _file.Substring (1, _file.Length - 2);
					}

				}	// End ExitFile

			/// <summary>
			/// This saves a list of file names to the _file_list member variable. This grammar rule is used by many other rules
			/// </summary>
			/// <param name="Context">ANTLR parse context</param>
			public override void 
			ExitFile_list 
				(
				[NotNull] CLIParser.File_listContext	Context
				)
				{

				//
				// A little LINQ magic. Get the list of string tokens, skipping commas which are separators, strip off any surrounding double quotes,
				// and store them in the list member variable
				//

				_file_list = (
					from e in Context.children 
					let txt = e.GetText ()
					where !txt.Equals (",") 
					select txt.StartsWith ("\"") && txt.EndsWith ("\"") ? txt.Substring (1, txt.Length - 2) : txt).ToList ();
				}   // End ExitFile_list

			/// <summary>
			/// If /GENERATE was specified, then record that. If both /GENERATE and /NOGENERATE are specified, then the last one on the command 
			/// line wins
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void 
			ExitGenerate 
				(
				[NotNull] CLIParser.GenerateContext	Context
				)
				{
				parsed_command_line.generate = true;
				}   // End ExitGenerate

			/// <summary>
			/// If /NOGENERATE was specified, then record that. If both /GENERATE and /NOGENERATE are specified, then the last one on the command 
			/// line wins
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void 
			ExitNo_generate 
				(
				[NotNull] CLIParser.No_generateContext	Context
				)
				{
				parsed_command_line.generate = false;
				}   // End ExitGenerate

			/// <summary>
			/// If /HELP was specified, then record that
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void
			ExitHelp_qual 
				(
				[NotNull] CLIParser.Help_qualContext	Context
				)
				{
				parsed_command_line.help = true;
				}   // End ExitHelp

			/// <summary>
			/// If /IMPORTS was specified, then record that
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void
			ExitImports_qual 
				(
				[NotNull] CLIParser.Imports_qualContext	Context
				)
				{
				parsed_command_line.imports = true;
				}   // End ExitImports_qual

			/// <summary>
			/// If /INCLUDE_DLLS was specified, then it may have one or more file names associated with it. Add all the file names to the list of
			/// DLLs that should be included
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void
			ExitInclude_dlls_qual 
				(
				[NotNull] CLIParser.Include_dlls_qualContext	Context
				)
				{

				//
				// Get either the file name or list of file names
				//

				if (_file != null)
					{
					parsed_command_line.include_dlls.Add (_file);
					_file = null;
					}
				else
					{
					parsed_command_line.include_dlls = _file_list;
					_file_list = null;
					}

				}   // End ExitExclude_dll_qual

			/// <summary>
			/// This captures the list of input files
			/// </summary>
			/// <param name="Context">ANTLR parser context</param>
			public override void 
			ExitInput_files 
				(
				[NotNull] CLIParser.Input_filesContext	Context
				)
				{

				//
				// A little LINQ magic. Get the list of string tokens. Input files are separated by space, so unlike the file_list rule, we don't 
				// need to skip commas
				//

				parsed_command_line.file_names = (from e in Context.children select e.GetText ()).ToList ();
				}   // End ExitInput_files

			/// <summary>
			/// If /OUTPUT=filename was specified, then save the file name
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void
			ExitOutput_qual 
				(
				[NotNull] CLIParser.Output_qualContext	Context
				)
				{
				parsed_command_line.output = _file;
				_file = null;
				}   // End ExitOutput_qual

			/// <summary>
			/// If /RECURSE was specified, then record that
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void
			ExitRecurse_qual 
				(
				[NotNull] CLIParser.Recurse_qualContext	Context
				)
				{
				parsed_command_line.recurse = true;
				}   // End ExitRecurse_qual

			/// <summary>
			/// If a script file was specified (@filename), then save the file name
			/// </summary>
			/// <param name="Context">ANTLR parser context</param>
			public override void 
			ExitScript 
				(
				[NotNull] CLIParser.ScriptContext	Context
				)
				{
				parsed_command_line.script_file = Context.GetText ().Substring (1);
				}   // End ExitScript

			/// <summary>
			/// If /VERBOSE was specified, then record that
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void
			ExitVerbose_qual 
				(
				[NotNull] CLIParser.Verbose_qualContext	Context
				)
				{
				parsed_command_line.verbose = true;
				}   // End ExitVerbose

			/// <summary>
			/// If /WEBSCRAPE was specified, then record that. If both /WEBSCRAPE and /NOWEBSCRAPE are specified, then the last one on the command 
			/// line wins
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void 
			ExitWebscrape 
				(
				[NotNull] CLIParser.WebscrapeContext	Context
				)
				{
				parsed_command_line.webscrape = true;
				}   // End ExitWebscrape

			/// <summary>
			/// If /NOWEBSCRAPE was specified, then record that. If both /WEBSCRAPE and /NOWEBSCRAPE are specified, then the last one on the command 
			/// line wins
			/// </summary>
			/// <param name="Context">ANTLR parser context. Not used</param>
			public override void
			ExitNo_webscrape 
				(
				[NotNull] CLIParser.No_webscrapeContext	Context
				)
				{
				parsed_command_line.webscrape = false;
				}   // End ExitWebscrape

			}   // End class CLI_Listener_Overrides
		#endregion

		}   // End class Command_Parser

	#region Command_Line_Options
	/// <summary>
	/// This class contains the results of parsing the command line
	/// </summary>
	public class Command_Line_Options
		{
		public bool				all { get; set; }
		public string			database { get; set; }
		public List <string>	exclude_dlls { get; set; }
		public bool				exports { get; set; }
		public bool				generate { get; set; }
		public bool				help { get; set; }
		public bool				imports { get; set; }
		public List <string>	include_dlls { get; set; }
		public string			output { get; set; }
		public bool				recurse { get; set; }
		public bool				verbose { get; set; }
		public bool				webscrape { get; set; }
		public List <string>	file_names { get; set; }
		public string			script_file { get; set; }
		public List <Regex>		excluded_dlls_regex { get; set; }
		public List <Regex>		included_dlls_regex { get; set; }

		public Command_Line_Options ()
			{
			all = false;
			database = "";
			exclude_dlls = new List <string> ();
			exports = false;
			generate = true;
			help = false;
			imports = false;
			include_dlls = new List <string> ();
			output = "";
			recurse = false;
			script_file = "";
			verbose = false;
			webscrape = true;
			file_names = new List <string> ();
			}   // End constructor Command_Line_Options

		}   // End class Command_Line_Options
	#endregion

	}   // End namespace FDI.AutoGen
