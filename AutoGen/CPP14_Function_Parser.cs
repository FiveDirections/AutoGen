//
// FACILITY:	Function_Parser - CPP14 function declaration parsing
//
// DESCRIPTION:	This module contains the routines for parsing a CPP14 function declaration. The CPP14 ANTLR grammar is part of a collection of grammars
//				that come with ANTLR (https://github.com/antlr/grammars-v4)
//
//				TODO: 
//					There are some bugs in the C grammar that forced some workarounds and ultimately the switch to using the C++ grammar. Of course,
//					it would be better to fix the grammar (https://github.com/antlr/grammars-v4/issues/1565) but I wasn't given the time to do so
//
// VERSION:		1.1
//
// AUTHOR:		Brian Catlin
//
// CREATED:		2019-12-02
//
// MODIFICATION HISTORY:
//
//	1.1		2020-03-08	Brian Catlin
//			General cleanup before release
//
//	1.0		2019-12-02	Brian Catlin
//			Original version
//

//
// System namespaces
//

using System;
using System.Collections.Generic;

//
// Third-party NuGet namespaces
//

using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;


namespace FDI.AutoGen
	{
	class CPP14_Function_Parser
		{

		/// <summary>
		/// Parse a string containing a C++ function declaration
		/// </summary>
		/// <param name="Declaration"></param>
		/// <returns>Api class containing a representation of the AST</returns>
		public Api
		do_parse
			(
			string Declaration
			)
			{

			//
			// Declare the various streams of characters and tokens for parsing the input
			//

			AntlrInputStream input_stream = new AntlrInputStream (Declaration);			// Create a stream that reads from the input source
			CPP14Lexer lexer = new CPP14Lexer (input_stream);							// Create a lexer that feeds off of the input stream
			CommonTokenStream tokens = new CommonTokenStream (lexer);					// Create a buffer of tokens pulled from the lexer
			CPP14Parser parser = new CPP14Parser (tokens);								// Create a parser that feeds off of the token buffer
			ParserRuleContext tree = parser.translationunit ();							// Call the translationunit rule in the grammar to build a parse tree from the input
			CPP14_Listener_Overrides my_listeners = new CPP14_Listener_Overrides ();	// Instantiate my listener override functions so they can be used by ParseTreeWalker

			//
			// Call all the listeners
			//

			ParseTreeWalker.Default.Walk (my_listeners, tree);

			return my_listeners.function_def;
			}   // End parse_declaration

		}   // End class Header_Parser

	#region C_Listener_Overrides
	/// <summary>
	/// This class contains the listen overrides that are called by ParseTreeWalker for each node in the parse tree.
	///
	/// NOTE: You need to be very familiar with the grammar (in file CPP14.g4) in order to make sense of this. Each parser rule may have an Enter and
	///		  an Exit listener, of the form {Enter|Exit}parser_rule_name. ANTLR generates a lexer and parser from the .g4 grammar file, and those files
	///		  are in the generated folder of this project and should not be edited. If you view the parse tree using the ANTLR 'grun' tool, this code
	///		  will make a lot more sense
	/// </summary>

	class CPP14_Listener_Overrides : CPP14BaseListener
		{
		public Api	function_def = new Api ();
		bool		in_params_list = false;
//		bool		first_param = true;
		Api_Param	cur_parameter = new Api_Param ();

		public override void EnterDeclaration ([NotNull] CPP14Parser.DeclarationContext context)
			{
			var text = context.GetText ();

			Console.WriteLine ($"Prototype: {text} ");
			in_params_list = false;
			function_def.specifiers = new List <string> ();
			function_def.ret_type_idx = 0;
			function_def.func_name = string.Empty;
			function_def.parameters = new List <Api_Param> ();
			}   // End EnterDeclaration

		public override void EnterParameterdeclaration ([NotNull] CPP14Parser.ParameterdeclarationContext context)
			{
			var text = context.GetText ();

			cur_parameter = new Api_Param ();

			}   // End EnterParameterdeclaration

		public override void EnterParameterdeclarationclause ([NotNull] CPP14Parser.ParameterdeclarationclauseContext context)
			{
			var text = context.GetText ();

			in_params_list = true;

			//
			// Look for an empty parameter list, e.g. bool rtn ();
			//

			if (context.ChildCount == 0)
				{
				function_def.parameters.Clear ();

				Console.WriteLine ("();\n");
				}

			}   // End EnterParameterdeclarationclause

		public override void ExitCvqualifier ([NotNull] CPP14Parser.CvqualifierContext context)
			{
			var text = context.GetText ();


			cur_parameter.type_qualifier = text;
			}

		public override void ExitDeclaration ([NotNull] CPP14Parser.DeclarationContext context)
			{
			Console.WriteLine ();

			//
			// Display the prototype using what we parsed
			//

			foreach (string sc in function_def.specifiers)
				{
				Console.WriteLine (sc);
				}

			Console.WriteLine (function_def.func_name);
			Console.WriteLine ("\t(");

			foreach (Api_Param p in function_def.parameters)
				{
				Console.Write ($"\t");

				if (p.is_input)
					{
					Console.Write ("INPUT ");
					}

				if (p.is_output)
					{
					Console.Write ("OUTPUT ");
					}

				Console.Write ($"{p.type_qualifier} {p.type} ");

				foreach (string s in p.storage_class)
					{
					Console.Write ($"{s} ");
					}

				Console.WriteLine ($"{p.param_name}");
				}

			Console.WriteLine ("\t);\n");

			}   // End ExitDeclaration

		public override void ExitLinkagespecification ([NotNull] CPP14Parser.LinkagespecificationContext context)
			{
			var text = context.GetText ();

			Console.WriteLine ($" {text}");
			}   // End ExitLinkagespecification

		public override void ExitMicrosoft_linkage ([NotNull] CPP14Parser.Microsoft_linkageContext context)
			{
			var text = context.GetText ();

			Console.WriteLine ($" {text}");
			}   // End ExitMicrosoft_linkage

		public override void ExitMicrosoft_storage ([NotNull] CPP14Parser.Microsoft_storageContext context)
			{
			var text = context.GetText ();

			if (in_params_list)
				{
				Console.WriteLine ($"{text}");
				cur_parameter.storage_class.Add (text);
				}
			else
				{
				function_def.specifiers.Add (text);
				Console.WriteLine ($"{text} ");
				}

			}   // End ExitMicrosoft_storage

		public override void ExitParameterdeclaration ([NotNull] CPP14Parser.ParameterdeclarationContext context)
			{
			var text = context.GetText ();

			//
			// Sometimes there isn't a parameter name. If not and it is a real parameter (not just 'void'), then generate a name
			//

			if ((cur_parameter.param_name.Length == 0) && (cur_parameter.type.ToUpper () != "VOID"))
				{
				cur_parameter.param_name = "Unspecified_" + (function_def.parameters.Count + 1).ToString ();
				}

			//
			// Only add the parameter if it is named. It should only be unnamed when there is a declaration like: int func (void);
			//

			if (cur_parameter.param_name.Length != 0)
				{
				function_def.parameters.Add (cur_parameter);
				}

//			first_param = false;
			}   // End ExitParameterdeclaration

		public override void ExitPtroperator ([NotNull] CPP14Parser.PtroperatorContext context)
			{
			var text = context.GetText ();
			var child_type = context.children [0].GetType ();

			if (in_params_list)
				{
				cur_parameter.num_ptr += 1;
				cur_parameter.type += "*";
				Console.Write ($"*");
				}
			else
				{
				function_def.specifiers [function_def.ret_type_idx] += "*";
				}

			}   // End ExitPtroperator

		public override void ExitSal_statement ([NotNull] CPP14Parser.Sal_statementContext context)
			{
			var text = context.GetText ();

			if (in_params_list)
				{

				//
				// Look for _Inout_ or _Out_ in the SAL string. If we find one, then mark this as an output parameter
				//

				if (text.Contains ("_Inout_"))
					{
					cur_parameter.is_input = true;
					cur_parameter.is_output = true;
					Console.Write ($"{text} ");
					}
				else if (text.Contains ("_Out_"))
					{
					cur_parameter.is_output = true;
					Console.Write ($"{text} ");
					}
				else
					{
					cur_parameter.is_input = true;
					Console.Write ($"{text} ");
					}

				}
			else
				{
				Console.WriteLine ($"{text}");
				}

			}   // End ExitSal_statement

		public override void ExitSimpletypespecifier ([NotNull] CPP14Parser.SimpletypespecifierContext context)
			{
			var text = context.GetText ();

			//
			// simpletypespecifier is used for the standard C++ types, and as a parent for microsoft_types. In either case, the text is the type name
			// that we need
			//

			if (in_params_list)
				{
				cur_parameter.type = text;

				Console.Write ($" {text}");         // Parameter type
				}
			else
				{
				function_def.ret_type_idx = function_def.specifiers.Count;
				function_def.specifiers.Add (text);
				function_def.ret_type = text;

				Console.WriteLine ($"{text}");      // Routine return type
				}

			}   // End ExitSimpletypespecifier

		public override void ExitUnqualifiedid ([NotNull] CPP14Parser.UnqualifiedidContext context)
			{
			var text = context.GetText ();

			//
			// Determine if this is the routine name or a parameter name
			//

			if (in_params_list)
				{
				cur_parameter.param_name = text;

				Console.WriteLine ($" {text}");         // Parameter name
				}
			else
				{
				function_def.func_name = text;

				Console.WriteLine ($"{text}");      // Routine name
				}

			}   // End ExitUnqualifiedid




		/*
		public override void ExitDirectDeclarator ([NotNull] CPP14Parser.DirectDeclaratorContext context)
			{
			var text = context.GetText ();
			var token = context.Start;

			//
			// directDeclarator is used for the routine name and individual parameters. Sometimes, a directDeclarator will be nested, if so then
			// we don't want this node
			//

			if (context.ChildCount == 1)
				{

				//
				// Determine if this is the routine name or a parameter name
				//

				if (in_params_list)
					{
					cur_parameter.param_name = text;

					Console.Write ($" {text}");         // Parameter name
					}
				else
					{
					function_def.func_name = text;

					Console.WriteLine ($"{text}");      // Routine name
					}

				}
			else
				{

				//
				// Look for an empty parameter list, e.g. bool rtn ();
				//

				if ((context.children [context.ChildCount - 1].GetText () == ")") && (context.children [context.ChildCount - 2].GetText () == "("))
					{
					function_def.parameters.Clear ();

					Console.WriteLine ("();\n");
					}

				}

			}   // End ExitDirectDeclarator

		public override void EnterExternalDeclaration ([NotNull] CPP14Parser.ExternalDeclarationContext context)
			{
			var text = context.GetText ();
			Console.WriteLine ($"Prototype: {text} ");
			in_params_list = false;
			function_def.specifiers = new List <string> ();
			function_def.ret_type_idx = 0;
			function_def.func_name = string.Empty;
			function_def.parameters = new List <Api_Param> ();
			}   // End EnterExternalDeclaration

		public override void ExitExternalDeclaration ([NotNull] CPP14Parser.ExternalDeclarationContext context)
			{
			Console.WriteLine ();

			//
			// Display the prototype using what we parsed
			//

			foreach (string sc in function_def.specifiers)
				{
				Console.WriteLine (sc);
				}

			Console.WriteLine (function_def.func_name);
			Console.WriteLine ("\t(");

			foreach (Api_Param p in function_def.parameters)
				{
				Console.Write ($"\t");

				if (p.is_input)
					{
					Console.Write ("INPUT ");
					}

				if (p.is_output)
					{
					Console.Write ("OUTPUT ");
					}

				Console.Write ($"{p.type_qualifier} {p.type} ");

				foreach (string s in p.storage_class)
					{
					Console.Write ($"{s} ");
					}

				Console.WriteLine ($"{p.param_name}");
				}

			Console.WriteLine ("\t);\n");

			//
			// Clear all context info
			//

#if false
			function_def.parameters.Clear ();
			cur_parameter.clear ();
			function_def.specifiers.Clear ();
			function_def.ret_type_idx = 0;
			function_def.func_name = string.Empty;
#endif
			}   // End ExitExternalDeclaration

		public override void ExitMicrosoft_storage ([NotNull] CPP14Parser.Microsoft_storageContext context)
			{
			var text = context.GetText ();

			if (in_params_list)
				{
				Console.WriteLine ($"{text}");
				cur_parameter.storage_class.Add (text);
				}
			else
				{
				function_def.specifiers.Add (text);
				Console.WriteLine ($"{text} ");
				}

			}   // End ExitMicrosoft_storage

		public override void ExitMicrosoft_types ([NotNull] CPP14Parser.Microsoft_typesContext context)
			{
			var text = context.GetText ();

			if (in_params_list)
				{
				Console.WriteLine ($"{text}");
				cur_parameter.type = text;
				}
			else
				{
				function_def.specifiers.Add (text);
				Console.WriteLine ($"{text} ");
				}

#if false
				//
				// The grammar doesn't handle all the funky Microsoft syntax. It is easier to work around it here
				// If we haven't set the return type yet, then use this value; otherwise, this is the function name

				if (function_def.ret_type_idx == -1)
					{
					function_def.ret_type_idx = (int) function_def.specifiers.Count;
					function_def.specifiers.Add (text);
					in_params_list = true;
					}
				else
					{
					function_def.func_name = text;
					}

				Console.WriteLine ($"{text}");
				}
			else
				{
				cur_parameter.type = text;
				Console.Write ($"{text} ");
				}

#endif
			}   // End ExitMicrosoft_types

		public override void EnterParameterDeclaration ([NotNull] CPP14Parser.ParameterDeclarationContext context)
			{
			var text = context.GetText ();

			cur_parameter = new Api_Param ();

			if (!first_param)
				{
				Console.WriteLine (",");
				}

			Console.Write ("\t");
			}   // End EnterParameterDeclaration

		public override void ExitParameterDeclaration ([NotNull] CPP14Parser.ParameterDeclarationContext context)
			{

			//
			// Sometimes there isn't a parameter name. If not and it is a real parameter (not just 'void'), then generate a name
			//

			if ((cur_parameter.param_name.Length == 0) && (cur_parameter.type.ToUpper () != "VOID"))
				{
				cur_parameter.param_name = "Unspecified_" + (function_def.parameters.Count + 1).ToString ();
				}

			//
			// Has the parameter type been set? If not, then it wasn't annotated by SAL
			//

			if (!cur_parameter.is_input && !cur_parameter.is_output)
				{

				//
				// If the type is a pointer, then mark the parameter appropriately
				//

				if (cur_parameter.num_ptr == 0)
					{

					//
					// There wasn't an asterisk, so try to infer if this type is a pointer-type. In most cases, pointer-types start with a
					// 'P', 'PC', or 'LP', so check for that. If we find one, then mark it as input-output; otherwise, mark it as just input.
					// This is a heuristic, so there may be some error
					//

					if ((cur_parameter.type.StartsWith ("P")) || (cur_parameter.type.StartsWith ("PC")) || (cur_parameter.type.StartsWith ("LP")))
						{
						cur_parameter.is_input = true;
						cur_parameter.is_output = true;
						}
					else
						{
						cur_parameter.is_input = true;
						}

					}
				else if (cur_parameter.num_ptr == 1)
					{

					//
					// If this is a pointer-type, then mark it as input-output
					//

					cur_parameter.is_input = true;
					cur_parameter.is_output = true;
					}
				else
					{

					//
					// Two or more asterisks mean that this is almost certainly an output-only parameter
					//

					cur_parameter.is_output = true;
					}

				}

			//
			// Only add the parameter if it is named. It should only be unnamed when there is a declaration like: int func (void);
			//

			if (cur_parameter.param_name.Length != 0)
				{
				function_def.parameters.Add (cur_parameter);
				}

			first_param = false;
			}   // End ExitParameterDeclaration

		public override void EnterParameterTypeList ([NotNull] CPP14Parser.ParameterTypeListContext context)
			{
			var text = context.GetText ();
			Console.WriteLine ("\t(");
			in_params_list = true;
			first_param = true;
			}   // End ExitParameterList

		public override void ExitParameterTypeList ([NotNull] CPP14Parser.ParameterTypeListContext context)
			{
			var text = context.GetText ();

			Console.WriteLine ("\n\t);\n");
			first_param = true;
			}   // End ExitTypedefName

		public override void EnterPointer ([NotNull] CPP14Parser.PointerContext context)
			{
			var text = context.GetText ();
			var child_type = context.children [0].GetType ();

			if (in_params_list)
				{

				if (child_type == typeof (TerminalNodeImpl))
					{
					cur_parameter.num_ptr += 1;
					cur_parameter.type += "*";
					Console.Write ($"*");
					}

				}
			else
				{
				function_def.specifiers [(int) function_def.ret_type_idx] += "*";
				}

			}   // End EnterPointer

		public override void ExitSal_statement ([NotNull] CPP14Parser.Sal_statementContext context)
			{
			var text = context.GetText ();

			if (in_params_list)
				{

				//
				// Look for _Inout_ or _Out_ in the SAL string. If we find one, then mark this as an output parameter
				//

				if (text.Contains ("_Inout_"))
					{
					cur_parameter.is_input = true;
					cur_parameter.is_output = true;
					Console.Write ($"{text} ");
					}
				else if (text.Contains ("_Out_"))
					{
					cur_parameter.is_output = true;
					Console.Write ($"{text} ");
					}
				else
					{
					cur_parameter.is_input = true;
					Console.Write ($"{text} ");
					}

				}
			else
				{
				Console.WriteLine ($"{text}");
				}

			}   // End ExitSal_statement

		public override void ExitStorageClassSpecifier ([NotNull] CPP14Parser.StorageClassSpecifierContext context)
			{
			var text = context.GetText ();
			var child_type = context.children [0].GetType ();

			if (context.ChildCount == 1 && child_type == typeof (TerminalNodeImpl))
				{
				Console.WriteLine ($"{text}");
				}

			}   // End ExitTypedefName

		public override void ExitTypedefName ([NotNull] CPP14Parser.TypedefNameContext context)
			{
			var text = context.GetText ();

			if (!in_params_list)
				{
				function_def.ret_type_idx = function_def.specifiers.Count;
				function_def.specifiers.Add (text);
				Console.WriteLine ($"{text}");
				}
			else
				{
				cur_parameter.type = text;
				Console.Write ($"{text} ");
				}

#if false
			if (!in_params_list)
				{

				//
				// The grammar doesn't handle all the funky Microsoft syntax. It is easier to work around it here
				// If we haven't set the return type yet, then use this value; otherwise, this is the function name

				if (function_def.ret_type_idx == -1)
					{
					function_def.ret_type_idx = (int) function_def.specifiers.Count;
					function_def.ret_type = text;
					function_def.specifiers.Add (text);
					in_params_list = true;
					}
				else
					{
					function_def.func_name = text;
					}

				Console.WriteLine ($"{text}");
				}
			else
				{
				cur_parameter.type = text;
				Console.Write ($"{text} ");
				}

#endif
			}   // End ExitTypedefName

		public override void ExitTypeQualifier ([NotNull] CPP14Parser.TypeQualifierContext context)
			{
			var text = context.GetText ();
			var child_type = context.children [0].GetType ();

			if (context.ChildCount == 1)
				{

				if (in_params_list)
					{
					cur_parameter.type_qualifier = text;
					}

				Console.Write ($"{text} ");
				}

			}   // End ExitTypeSpecifier

		public override void ExitTypeSpecifier ([NotNull] CPP14Parser.TypeSpecifierContext context)
			{
			var text = context.GetText ();
			var child_type = context.children [0].GetType ();

			if (context.ChildCount == 1 && child_type == typeof (TerminalNodeImpl))
				{

				if (in_params_list)
					{
					cur_parameter.type = text;
					Console.Write ($"{text} ");
					}
				else
					{
					function_def.ret_type_idx = (int) function_def.specifiers.Count;
					function_def.specifiers.Add (text);
					Console.WriteLine ($"{text}");
					}

				}

			}   // End ExitTypeSpecifier
*/

		}   // End class CPP14_Listener_Overrides

	#endregion


	#region Api
	/// <summary>
	/// This class holds a binary representation of the parse tree for a function
	/// 
	/// TODO:
	///		  This grew by accretion, rather than by design. What it should be is a true AST
	/// </summary>
	public class Api
		{
		public string			func_name { get; set; }
		public string			ret_type { get; set; }
		public List <string>	specifiers { get; set; }
		public List <Api_Param>	parameters { get; set; }
		public List <Api_Param>	output_parameters { get; set; }	// Workaround for StringTemplate bug #126
		public uint				id { get; set; }
		public bool				ret_void { get; set; }
		public bool				ret_pointer { get; set; }
		public bool				ret_custom { get; set; }
		public bool				ret_scalar { get; set; }
		public string			header { get; set; }
		public bool				has_outputs { get; set; }
		public int				ret_type_idx { get; set; }

		public Api ()
			{
			}
		}   // End class Api

	public class Api_Param
		{
		public List <string>	storage_class { get; set; }
		public string			type_qualifier { get; set; }
		public string			type { get; set; }
		public string			param_name { get; set; }
		public uint				num_ptr { get; set; }
		public bool				is_asciz { get; set; }
		public bool				is_wstrz { get; set; }
		public bool				is_input { get; set; }
		public bool				is_output { get; set; }
		public bool				is_pointer { get; set; }
		public bool				is_scalar { get; set; }
		public bool				is_enum { get; set; }
		public bool				is_custom { get; set; }

		public Api_Param ()
			{
			storage_class = new List <string> ();
			clear ();
			}   // End constructor Param

		public void clear ()
			{
			storage_class.Clear ();
			type_qualifier = string.Empty;
			type = string.Empty;
			param_name = string.Empty;
			num_ptr = 0;
			is_asciz = false;
			is_wstrz = false;
			is_input = false;
			is_output = false;
			is_pointer = false;
			}   // End clear

		}   // End class Api_Param

	#endregion

	}   // End namespace FDI.AutoGen

