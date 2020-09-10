//
// FACILITY:	Utils_DB - SQL-compliant database utilities
//
// DESCRIPTION:	This module contains a class for manipulating an Access database.
//
//				NOTE: The 64-bit Access database provider (free from Microsoft) must be installed
//
//				TODO: 
//						Leave the database open. Opening and closing it all the time is expensive
//
// VERSION:		1.1
//
// AUTHOR:		Brian Catlin
//
// CREATED:		2019-11-22
//
// MODIFICATION HISTORY:
//
//	1.1		2020-03-09	Brian Catlin
//			General cleanup before release
//
//	1.0		2019-11-22	Brian Catlin
//			Original version
//

//
// System namespaces
//

using System;
using System.Collections.Generic;
using System.Data;
using System.Data.OleDb;
using System.IO;

namespace FDI.AutoGen
	{
	class DB_Access
		{
		#region "Public Methods"

		/// <summary>
		/// Read a table from the database
		/// </summary>
		/// <param name="Query">SQL query</param>
		/// <param name="Parameters">Parameters for the query, and prevents SQL-injection attacks</param>
		/// <param name="Command_type">SQL command type</param>
		/// <returns>DataTable containing the table</returns>
		public static DataTable
		get_table_from_query
			(
			string	Database,
			string Query,
			Dictionary <string, object> Parameters,
			CommandType Command_type
			)
			{
			DataTable   data_table = new DataTable ();

			//
			// Open a connection to the database
			//

			using (OleDbConnection conn = get_connection (Database))
				{

				//
				// Build the query for the database
				//

				using (OleDbCommand cmd = new OleDbCommand (Query, conn))
					{
					cmd.CommandType = Command_type;

					//
					// Were any additional parameters specified?
					//

					if (Parameters != null)
						{

						//
						// Add any parameters that further constrain the query
						//

						foreach (KeyValuePair <string, object> parameter in Parameters)
							{
							cmd.Parameters.AddWithValue (parameter.Key, parameter.Value);
							}

						}

					//
					// Read the table from the database into the data set that is being returned
					//

					using (OleDbDataAdapter adapter = new OleDbDataAdapter (cmd))
						{
						adapter.Fill (data_table);
						}

					}

				}

			return data_table;
			}   // End get_table_from_query

		/// <summary>
		/// Read an object from the database
		/// </summary>
		/// <param name="Query">SQL query</param>
		/// <param name="Parameters">Parameters for the query, and prevents SQL-injection attacks</param>
		/// <param name="Command_type">SQL command type</param>
		/// <returns>object from the database</returns>
		public static object
		get_single_object_from_query
			(
			string Database,
			string Query,
			Dictionary <string, object> Parameters,
			CommandType Command_type
			)
			{
			object  value = null;

			//
			// Open a connection to the database
			//

			using (OleDbConnection conn = get_connection (Database))
				{

				//
				// Build the query for the database
				//

				using (OleDbCommand cmd = new OleDbCommand (Query, conn))
					{
					cmd.CommandType = Command_type;

					//
					// Were any additional parameters specified?
					//

					if (Parameters != null)
						{

						//
						// Add any parameters that further constrain the query
						//

						foreach (KeyValuePair <string, object> parameter in Parameters)
							{
							cmd.Parameters.AddWithValue (parameter.Key, parameter.Value);
							}

						}

					//
					// Open a connection to the database
					//

					conn.Open ();

					//
					// Read the row(s) from the database
					//

					using (OleDbDataReader reader = cmd.ExecuteReader ())
						{

						while (reader.Read ())
							{
							value = reader.GetValue (0);
							}

						}

					}

				}

			return value;
			}   // End get_single_object_from_query

		/// <summary>
		/// Execute commands such as SQL INSERT, DELETE, UPDATE, and SET
		/// </summary>
		/// <param name="Sql_command">SQL command to execute</param>
		/// <param name="Parameters">Parameters for the command, and prevents SQL-injection attacks</param>
		/// <param name="Command_type"></param>
		/// <returns>The number of rows affected by the command</returns>
		public static int
		execute_non_query
			(
			string Database,
			string Sql_command,
			Dictionary <string, object> Parameters,
			CommandType Command_type
			)
			{
			int rows_affected = 0;

			//
			// Open a connection to the database
			//

			using (OleDbConnection conn = get_connection (Database))
				{

				//
				// Build the command for the database
				//

				using (OleDbCommand cmd = new OleDbCommand (Sql_command, conn))
					{
					cmd.CommandType = Command_type;

					//
					// Were any additional parameters specified?
					//

					if (Parameters != null)
						{

						//
						// Add any parameters to the command
						//

						foreach (KeyValuePair <string, object> parameter in Parameters)
							{
							cmd.Parameters.AddWithValue (parameter.Key, parameter.Value);
							}

						}

					//
					// Open a connection to the database
					//

					cmd.Connection.Open ();

					//
					// Execute the command
					//

					rows_affected = cmd.ExecuteNonQuery ();
					}

				}

			return rows_affected;
			}   // End execute_non_query

		/// <summary>
		/// Insert a new record (row) into the table
		/// </summary>
		/// <param name="Record">Dictionary containing the fields for the record. Specifying the data as parameters prevents SQL-injection attacks</param>
		public static void
		insert_record
			(
			string Database,
			Dictionary<string, object>	Record
			)
			{
			string  insert_sql = "INSERT INTO API_data (API, Prototype, Header, Library, DLL, Automated_lookup, Lookup_time, Help_page)" +
				" VALUES (@API, @Prototype, @Header, @Library, @DLL, @Automated_lookup, @Lookup_time, @Help_page, @Undocumented_API, @Detourable)";
			int     rows_affected = 0;


			//
			// Open a connection to the database
			//

			using (OleDbConnection conn = get_connection (Database))
				{

				//
				// Build the command for the database
				//

				using (OleDbCommand cmd = new OleDbCommand (insert_sql, conn))
					{

					//
					// Get the fields from the dictionary
					//

					if (Record != null)
						{

						//
						// Add any parameters to the command
						//

						foreach (KeyValuePair <string, object> parameter in Record)
							{
							cmd.Parameters.AddWithValue (parameter.Key, parameter.Value);
							}

						//
						// Open a connection to the database
						//

						cmd.Connection.Open ();

						//
						// Insert the record. If more than one row was affected, then throw an error
						//

						if ((rows_affected = cmd.ExecuteNonQuery ()) != 1)
							{
							throw new InvalidOperationException (string.Format ("Number of effected rows ({0}) should be 1", rows_affected));
							}

						}
					else
						{
						throw new ArgumentNullException (nameof (Record), "Missing data for record");
						}

					}

				}

			}   // End insert_record

		#endregion

		#region "Private Methods"
		/// <summary>
		/// Return the connection string needed to connect to our database
		/// </summary>
		/// <param name="Database"></param>
		/// <returns>OleDbConnection object</returns>
		private static OleDbConnection
		get_connection (string Database)
			{
			string connection_string = "Provider=Microsoft.ACE.OLEDB.12.0; Data source = " +
				Path.GetFullPath (Path.Combine (Directory.GetCurrentDirectory (), Database));
			return new OleDbConnection (connection_string);
			}   // End get_connection

		#endregion
		}   // End class get_connection

	}   // End namespace FDI.AutoGen
