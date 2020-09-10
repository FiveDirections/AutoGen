//
// Command line grammar for AutoGen
//

grammar CLI;

start :
				script
			|	qualifier* input_files* qualifier*
				;

script :
				'@' FILE_NAME
				;

input_files :
				FILE_NAME+
				;

qualifier :
				all_qual
			|	database_qual
			|   exclude_dlls_qual
			|   exports_qual
			|   help_qual
			|	generate_qual
			|   imports_qual
			|	include_dlls_qual
			|	output_qual
			|   recurse_qual
			|   verbose_qual
			|	webscrape_qual
				;

all_qual :           
				qual_char ALL
				;

database_qual :
				qual_char DATABASE assignment_char file
				;

exclude_dlls_qual :
				qual_char EXCLUDE_DLLS assignment_char (file | '(' file_list ')')
				;

exports_qual :
				qual_char EXPORTS
				;

generate_qual :
				qual_char GENERATE		# generate
			|	qual_char NOGENERATE	# no_generate
				;

help_qual:
				qual_char HELP
			|	qual_char '?'
				;

imports_qual :
				qual_char IMPORTS
				;

include_dlls_qual :

				qual_char INCLUDE_DLLS assignment_char (file | '(' file_list ')')
				;

output_qual :
				qual_char OUTPUT assignment_char file
				;

recurse_qual :
				qual_char RECURSE
				;

verbose_qual :
				qual_char VERBOSE
				;

webscrape_qual :
				qual_char WEBSCRAPE		# webscrape
			|	qual_char NOWEBSCRAPE	# no_webscrape
				;

file :
				FILE_NAME
				;

file_list :
				FILE_NAME (',' FILE_NAME)*
				;

qual_char :
				'/'
			|   '-'
				;

assignment_char :
				'='
			|	':'
				;

//
// Tokens
//

//
// This method of describing the qualifiers allows them to be abbreviated
//

ALL :           A (L (L)? )?;
DATABASE :		D (A (T (A (B (A (S (E)? )? )? )? )? )? )? ;
EXCLUDE_DLLS :  E X C (L (U (D (E ('_' (D (L (L (S)? )? )? )? )? )? )? )? )? ;
EXPORTS :       E X P (O (R (T (S)? )? )? )? ;
GENERATE :		G (E (N (E (R (A (T (E)? )? )? )? )? )? )? ;
NOGENERATE :	N O	G (E (N (E (R (A (T (E)? )? )? )? )? )? )? ;
HELP :          H (E (L (P)? )? )? ;
IMPORTS :       I M (P (O (R (T (S)? )? )? )? )? ;
INCLUDE_DLLS :  I N (C (L (U (D (E ('_' (D (L (L (S)? )? )? )? )? )? )? )? )? )? ;
OUTPUT :		O (U (T (P (U (T)? )? )? )? )? ;
RECURSE :       R (E (C (U (R (S (E)? )? )? )? )? )? ;
VERBOSE :       V (E (R (B (O (S (E)? )? )? )? )? )? ;
WEBSCRAPE :		W (E (B (S (C (R (A (P (E)? )? )? )? )? )? )? ) ;
NOWEBSCRAPE :	N O W (E (B (S (C (R (A (P (E)? )? )? )? )? )? )? ) ;

FILE_NAME :     [a-zA-Z0-9.#$%^&*?`~{};[\]+_\\:]+   // If the following chars '-()=,@!' are in a file name, then the file name needs to be in double-quotes
			|   '"' (~('|' | '<' | '>' | '\r' | '\n' | '"')+)*? '"'
				;

//STRING_LITERAL : '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))*? '"';

//
// These fragments provide the grammar with case insensitivity, because each fragment matches either its upper- or lower-case letter
//

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

COMMENT :			'!' ~[\r\n]* '\r'? '\n' -> channel (HIDDEN) ;
WS :				[ \t\r\n]+ -> channel (HIDDEN) ;					// Ignore all whitespace
