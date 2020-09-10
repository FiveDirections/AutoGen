# Win32 API Tracing Tools
Five Directions, Inc.
August 2020

## About

The tools in this tree were written by Brian Catlin for 
Five Directions Inc. (FiveDirections.com), as part of a contract with the 
Defense Advanced Research Projects Agency (DARPA), to aid in analyzing 
Windows malware. DARPA has allowed us to open-source this software in the hope 
that it will be useful to the malware analysis community.

## Disclaimer
DARPA and Five Directions are releasing this code into the public domain to stimulate further research. Their release implies no obligation nor desire to support additional work in this space. The code is released as-is. DARPA and Five Directions  make no warranties as to the correctness, accuracy, or usefulness of the released code.

## License
This code is released without any license.

## Problem Addressed
AutoGen helps understand which Win32 APIs a program is using and to capture the 
data being passed to and from the APIs. AutoGen eliminates the tedious work of
developing the function prototypes for API interception by reading the list 
of imports or exports from one or more PE/COFF files, and 
then looking up the APIs on Microsoft's web site. AutoGen then generates a C++ file that contains 
the Detours registration and intercept routines. These routines use ETW to log information 
on each API called. The generated files require no hand editing.

The basic principle is to use the Microsoft 
[Detours](https://github.com/Microsoft/Detours "GitHub repository")
API interception tool to intercept calls to a specified subset of the Windows 
APIs used by the program being analyzed, and use
[Event Tracing for Windows (ETW)](https://docs.microsoft.com/en-us/windows-hardware/drivers/devtest/event-tracing-for-windows--etw-
 "Microsoft docs")
to log that a call was made to an API. ETW is a lightweight logging mechanism
that provides real-time and capture-to-file capabilities for user-defined 
events and their associated data. The Microsoft Research website has more 
information on the theory and operation of 
[Detours](https://www.microsoft.com/en-us/research/project/detours/ "Microsoft Research").

To use Detours, an *intercept DLL* must be written. The intercept DLL will 
register (and unregister) which APIs to intercept, and provide the intercept 
routines that are called when the target API is called. In our case, the 
intercept routine logs the parameters passed to the API, calls the target API, 
and logs any data and status when the API returns.

The Detours *WithDLL.exe* program starts the program being analyzed and loads 
the intercept DLL into the program's address space. The Detours requirment to 
use *WithDLL* is intrusive and makes it difficult to use with malware. To 
solve this problem, I wrote *InjectDLL.exe* which can load an *intercept DLL* 
into a running process without the process' knowledge. There is a companion 
tool named *EjectDLL.exe* that will cause a DLL injected by *InjectDLL* to be 
dynamically unloaded from the specified process.

Analyzing malware and writing an intercept DLL is tedious and time-consuming, 
especially because even a simple program may call hundreds of Win32 APIs. I 
wrote a proof-of-concept tool named **AutoGen** that can analyze a Portable 
Executable / Common Object File Format (PE/COFF) file (EXE, DLL, OCX, CPL, 
etc.) and generate a C++ file that contains the Detours registration and 
intercept routines that use ETW to log information on each API called. The 
generated file requires no hand editing, and is compiled in the **TraceAPI** 
project.

## Dependencies

The solution was developed in Visual Studio 2019. It would probably work under 
VS 2017 if someone had a burning need and wanted to back port it. The following 
dependencies are NuGet packages which should be automatically downloaded by VS 
when you open the solution.

1. Microsoft Detours
1. ANTLR
1. StringTemplate
1. PeNet
1. ScrapySharp
1. Boost Program_Options and Format (InjectDLL and EjectDLL, only)

## AutoGen Operation

AutoGen reads the list of imports or exports from one or more PE/COFF files and 
then looks up the APIs on Microsoft's web site using Bing Google throttles the 
number of lookups per minute and then locks out your IP address for a while if 
you exceed the limit. Bing also throttles, but is much more lenient than 
Google. Scraping web pages is time consuming, so the information on the APIs is 
stored in a Microsoft Access database (default name Win32API.accdb). The freely 
available 
[64-bit Microsoft Access runtime](https://www.microsoft.com/en-us/download/details.aspx?id=54920 "Microsoft") 
must be installed to use AutoGen. The web access methodology could probably be 
improved by using async-await. I didn't bother, because I had to limit the 
number of requests per second and this is just a proof of concept. Once I had 
the database populated, it ceased to be a problem.

The web page for the API is scraped to get the API's function signature (return 
type, parameters and their types). Unfortunately, not all of Microsoft's web 
pages follow the same layout and contain all the necessary information, so 
unless you edit the database and fill in the missing information, you won't be
able to generate a Detour those routines. There are a lot of routines in DLLs 
that are not documented, so obviously, you cannot Detour those routines, 
either. The database currently contains 25,000+ Win32 APIs. If an API is not 
in the database, its web page will be scraped and the API will automatically
be added to the database. With the database, AutoGen can usually skip scraping 
the web page when generating Detours for the most commonly used APIs. NOTE: 
The SQL database access module was hacked together from something else, and 
could use a LOT of improvement, such as leaving the database open while AutoGen 
is running (currently the database is opened and closed for every database 
access). Yeah, it is horribly inefficient, but as a proof of concept it was 
much more important to spend time elsewhere.

Once all the imported APIs are located, function signatures are parsed using 
the [ANTLR](https://www.antlr.org/) parser generator. The grammar source files 
(`.g4`) are an ANTLR EBNF description. The ANTLR C++ grammar 
([ANTLR grammars](https://github.com/antlr/grammars-v4)) is used to parse the 
function signature. I am using the C++ grammar because their C grammar is too 
buggy. The C++ grammar is not without its bugs, but I have been able to work 
around them. NOTE: I hacked the Microsoft-specific C++ features into the ANTLR 
grammar file. It isn't pretty, but it works. Barely. This is another area that 
could use lots of improvement. ANTLR is also used for describing the command 
line grammar. ANTLR requires that Java runtime be installed. See the ANTLR web 
site for version requirements.

If this project had continued, I would have stored the function signatures in 
the database as an Abstract Syntax Tree (AST), so I wouldn't have to parse it 
all the time.

For each API, the function signature is parsed and code is generated using the 
[StringTemplate](https://www.stringtemplate.org/) library. This is an extremely 
powerful library written by the same person that wrote ANTLR (and is used by 
ANTLR for generating its parsers). I found a minor bug in StringTemplate that I 
worked around.

The default output file for AutoGen is TraceAPI.cpp. The debug command line 
options for the AutoGen project will overwrite the TraceAPI.cpp output file in 
the TraceAPI project. So, after running AutoGen, just rebuild the TraceAPI 
project and you'll have your Detours intercept DLL that can be injected into a 
process using *InjectDLL*

## AutoGen Command Line Syntax

AutoGen provides a lot of flexibility to the user, which results in potentially 
a complex request. So, AutoGen supports a command line syntax that is much more 
robust than is usually seen for a console application. The basic syntax, in 
EBNF format, is:  `Autogen [qualifier]* [input_file]+ [qualifier]*`

In the above example, '*' means "zero or more" and '+' means "one or more",
so it doesn't matter if the input file(s) come first or the qualifier(s) come
first. Qualifiers may be before and/or after the list of input files. If more 
than one input file is specified, then the files must be separated by spaces
and grouped together, e.g., AutoGen /imp file1.exe file2.exe /v, or 
AutoGen /imp /v file1.exe file2.exe or AutoGen file1.exe file2.exe /imp /v. 

If this project had continued, I had planned on making some qualifiers 
positional (specific to the input file immediately before the qualifier or 
global if the qualifier was before any input files), while others were global 
no matter where they were placed on the command line. This would make it easy 
to create a single Detours *Intercept DLL* that contained Detours for APIs that 
appear in muliple input files.

### Input Files
One or more input files may be specified, and they must be valid PE/COFF files
(.EXE, .DLL, .CPL, .OCX, etc). A single Detours output file will be generated
for the entire set of input files. The input file name may contain the standard
Windows wildcard characters ('*' and '?'). Paths may not have a wildcard.
Input files are separated by whitespace, not commas (',').


### Default Paths
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
C:\Windows\System32 and stop looking (it will not also find the 32-bit version 
in C:\Windows\SysWow64).


### Quoting Rules
If any file name or path that includes the following characters "-( )=,@!", 
then the entire string must be inside double-quotes, e.g. ""File(1).dll"", or
""C:\Program Files\XYZ\a.exe"", or ""file!.exe"", or ""ab-cd.exe"" (because
'-' can be used a a qualifier switch, like '/', it must be double-quoted when
used in file name (this is an artifact of the parser grammar, and if this wasn't
just a proof of concept, I would have spent the time to fix this)).


### Case Sensitivity
All qualifiers are case-insensitive; upper-case, lower-case, or a combination
of the two is acceptable, e.g. /all, /ALL, /All are equivalent.


### Abbreviation
All qualifiers may be abbreviated to any degree, as long as they remain unique.
For example, /EXCLUDE_DLLS and /EXPORTS have the first two characters in common,
so you must supply at least the first three characters of these qualifiers to
prevent ambiguity, e.g. /EXC and /EXP. Qualifiers that do not share their  
beginning sequence in common may be abbreviated to a single character, e.g. /H 
or /V.


### Switch Character
The start character for all qualifiers may be either '/' or '-', e.g. -help
and /help are equivalent.


### Multiple Parameters
Commands that take one or more parameters, e.g. /EXCLUDE_DLLS may specify a
single parameter using an assignment character ('=' or ':'), e.g.
/EXCLUDE_DLLS=KERNEL32.DLL. When more than one parameter is specified, then the
parameters must be enclosed in parentheses and each parameter separated with a
comma (','), e.g. /EXCLUDE_DLLS=(USER32.DLL,GDI32.DLL).


### Whitespace
Whitespace may appear before or after punctuation characters (',=:()'), and is 
not significant unless the file name is enclosed in double-quotes, e.g. ""a file 
with spaces.txt"".


### Comments
The comment character is the '!' (exclamation point).  Everything from the '!'
to the end of the line is ignored.  Comments may be placed on a line with a 
command or on their own line.  Comments are very useful for documenting AutoGen 
scripts.


### Shell Interaction and Scripting
CMD.EXE and PowerShell each have their own method for parsing command lines, and
valid AutoGen commands may be misinterpreted by them. AutoGen commands may be
placed in a text file (along with comments) and the text file may be presented
to AutoGen as a script using the '@' command, e.g. @..\script.txt. In a script
file, qualifiers may be on multiple lines because the entire script is read and
passed to the parser.

### Qualifiers

#### /ALL
Do not skip CRTL DLLs. Normally, all routines in the various C Run-Time
Libraries are not Detourable.

#### /DATABASE=file.accdb
Path to the Access database used to remember API definitions. The default is
Win32API.accdb in the current directory. If only a path is specified, then the 
default file name will be appended to the path.

#### /EXCLUDE_DLLS=file.dll
#### /EXCLUDE_DLLS=(file1.dll, file2.dll [,filen.dll]...)
Do not process any routines in any of the specified DLLs. All other DLLs will 
be processed. Do not include any path information with the file name 
(executables don't include path information for their DLL imports). Wild card
 characters ('*?') are allowed.

#### /EXPORTS
Process exported routines from the specified input files. Typically, this
qualifier is used when the input files are DLLs. May also be used with
/IMPORTS.

#### /GENERATE (default)
#### /NOGENERATE
By default, AutoGen will generate a .CPP output file; however, in some
circumstances you may not want to generate a file, such as when you just
want to build the API database, in which case you would specify the
/NOGENERATE qualifier. It is not necessary to specify the /GENERATE qualifier
because it is the default. If both are specified, then the last one to be
parsed will take precedence. /NOGENERATE is usually used with /IMPORTS to 
add all APIs in a set of DLLs the database.

#### /HELP
#### /?
Displays this text.

#### /IMPORTS
Process imported routines from the specified input files. Typically, this
qualifier is used when the input files are EXEs, but may also be used with
DLLs. May also be used with /EXPORTS.

#### /INCLUDE_DLLS=file.dll
#### /INCLUDE_DLLS=(file1.dll,file2.dll [, filen.dll]...)
Only process routines found in the specified DLLs. This allows you to limit
the routines to be processed to just the DLLs you care about. Do not include
any path information with the file name (executables don't include path 
information for their DLL imports). Wild card characters ('*?') are allowed.

#### /OUTPUT=file.cpp
#### /OUTPUT=..\\..\\..
The default output file is TraceApi.cpp, but may be overridden with this
qualifier. If only a path is specified, then the default file name will be
appended to the path.

#### /RECURSE
Opens each imported DLL that is encountered and processes all of its exports
(and all of its children). Used to ensure that all DLLs and their dependencies 
are processed.

#### /VERBOSE
Writes status information to the console.

#### /WEBSCRAPE (default) 
#### /NOWEBSCRAPE
By default, when an imported or exported routine is not found in the database,
AutoGen will attempt to find the routine definition on Microsoft's web site.
By specifying /NOWEBSCRAPE, AutoGen will not perform a web search for routines
not in the database. It is not necessary to specify the /WEBSCRAPE qualifier
because it is the default. If both are specified, then the last one to be
parsed will take precedence.


#### EXAMPLES  
`AutoGen /IMPORTS /INCLUDE_DLLS=kernel32.dll taskmgr.exe hh.exe`  
`AutoGen /imp /inc=kernel32.dll taskmgr.exe hh.exe`

Create Detours for APIs that are imported by either EXE from KERNEL32.DLL. 
The output file will be TraceAPI.cpp in the current directory.

	
`AutoGen /EXPORTS /NOGENERATE kernel32.dll`  
`AutoGen /exp /nogen kernel32.dll`

Lookup all APIs exported by C:\WINDOWS\SYSTEM32\KERNEL32.DLL and add them to
the database.

`AutoGen /EXPORTS /IMPORTS /RECURSE notepad.exe`  
`AutoGen /exp /imp /rec notepad.exe`

Lookup all APIs imported by C:\WINDOWS\NOTEPAD.EXE as well as all APIs imported
by any DLL that is imported by NOTEPAD.EXE. The APIs are added to the database
and no output file is generated.

`AutoGen /IMPORTS /INCLUDE_DLLS=kernel32.dll taskmgr.exe /NOWEBSCRAPE`  
`AutoGen /imp /inc=kernel32.dll taskmgr.exe /noweb`

Create Detours for all APIs imported by C:\WINDOWS\SYSTEM32\TASKMGR.EXE that
are located in C:\WINDOWS\SYSTEM32\KERNEL32.DLL, but only if the APIs are 
already in the database.  The output file will be TraceAPI.cpp in the current 
directory.

`AutoGen /IMPORTS /INCLUDE_DLLS=kernel*.dll taskmgr.exe 
/OUTPUT=taskmgr.cpp`  
`AutoGen /imp /inc=kernel*.dll taskmgr.exe /out=taskmgr.cpp`

Create Detours for all APIs imported by C:\WINDOWS\SYSTEM32\TASKMGR.EXE that
are located in any DLL that begins with kernel* in directories specified in the 
section DEFAULT PATHS. The output file will be taskmgr.cpp in the current 
directory.

`AutoGen /DATABASE=..\..\Win32API.accdb /VERBOSE /IMPORTS  
notepad.exe /INCLUDE_DLL="api-ms-win-core-file*.dll" /OUTPUT=
..\..\TraceAPI\`  
`AutoGen /data=..\..\Win32API.accdb /v /imp notepad.exe 
/inc="api-ms-win-core-file*.dll /out=..\..\TraceAPI\`

Create Detours only for APIs that appear in any of the Win32 core file API DLLs 
in C:\\Windows\\System32\\downlevel that are called by C:\\Windows\\Notepad.exe. 
The output file will be TraceAPI.cpp in the TraceAPI directory 3 levels up, and 
the database file is 3 directory levels above the current directory.

## Building TraceAPI

The default output of AutoGen is TraceAPI.cpp. This file should be copied to the 
TraceAPI project, or written there by AutoGen by specifying the path to the 
TraceAPI project's directory using the /OUTPUT qualifier.

The long term plan was to invoke the compiler and linker from AutoGen so the 
output of AutoGen would be the Detours *Intercept DLL*. For now, you will just 
have to build TraceAPI in Visual Studio.

## Listening to events in real-time

I found that TraceView Plus from 
[MGTEK](https://www.mgtek.com/traceview "MGTEK website") works 
OK (it does have some bugs (as you can see in the screenshot below all tasks
are listed as DLL_Attach but if you look at the raw data for the event you'll
see that it is something else), but it is free for 30 days), and is a good way 
to watch the real-time ETW events written by TraceAPI. The TraceAPI.twx file in 
the solution directory starts TraceView Plus and configures it to listen for the 
ETW events written by TraceAPI.

The TraceAPI ETW provider is identified by its GUID 
\{FD06D490-ED39-4CFF-BE10-82C940BCBE74}. If you want to see operational trace 
logging of TraceAPI, InjectDLL, or EjectDLL, you can add the WPP traceing GUID 
\{DCDE5106-86EE-47F2-966A-B6C425ACD9F9} to the list of providers you are 
monitoring.

![TraceView Plus](https://github.com/FiveDirections/AutoGen/blob/master/README-TraceViewPlus.PNG)

## Injecting TraceAPI into a process

The InjectDLL program will inject TraceAPI.DLL into a process. InjectDLL uses 
the Boost Program_Options and Format libraries. Again, this was a proof of 
concept, so development speed and functionality were the driving goals. I would 
remove the Boost dependency and use ANTLR for the command line, if I had the 
time. NOTE: You cannot inject a 32-bit DLL into a 64-bit process, nor can you
inject a 64-bit DLL into a 32-bit process.

InjectDLL is heavily commented, so I won't reproduce that here. There are some 
important limitations:
1. You can only inject into a process in the current session
2. You cannot inject into a privileged process
3. You must be running with Admin privileges to inject into another process

These limitations would have been fixed if the project had continued.

To use InjectDLL with TraceAPI, just type:  
`InjectDLL.exe -p notepad.exe -d traceapi.dll`

![InjectDLL](https://github.com/FiveDirections/AutoGen/blob/master/README-InjectDLLCommand.PNG)

## Ejecting TraceAPI from a process

EjectDLL does the opposite of InjectDLL, and can cause a DLL to be removed from
another process. If you try to unload a DLL that wasn't loaded by InjectDLL, 
then it is likely that bad things will happen.

If you don't eject the DLL, it will automatically be unloaded when the target 
process terminates, so you are not required to unload it.

## Random Tidbits

### WPP Tracing

The 
[WPP tracing](https://docs.microsoft.com/en-us/windows-hardware/drivers/devtest/wpp-software-tracing "Microsoft docs")
mechanism used in InjectDLL,  EjectDLL, and TraceAPI depend on TraceWPP.exe and 
various files referenced on its command line being available in the SDK. 
Unfortunately, TraceWPP and its files are not stored in a standard directory 
that is known to the Microsoft Build environment created by Visual Studio. Also, 
the location of TraceWPP or its files in the SDK directory tree tends to change 
in some releases of the SDK causing the build to break. :-( 

In the solution directory, the file WPP.targets is included by the projects that
use WPP (by hand editing those .vcxproj files). See the comments in 
WPP_Tracing.h for more information on this.

The header that defines the WPP tracing macros and ETW GUID are in 
Global\WPP_Tracing.h and it is included by InjectDLL and EjectDLL. To see the 
WPP messages in real-time, specify the provider GUID
\{DCDE5106-86EE-47F2-966A-B6C425ACD9F9} to TraceView Plus or your favorite ETW
client.

There are special compiler flags needed to ensure the WPP strings get put into 
the .PDB files. WPP depends upon the \_\_LINE__ macro defined by the compiler, 
which is disabled if the  Debug Information Format property C++->General) is set
to Program Database for Edit and Continue (/Zl), which is the default for 
applications; therefore, any user-mode project including this file must set the 
Debug Information Format property to Program Database (/Zi).

Visual Studio does not natively support WPP for applications (the WDK adds 
property pages only for drivers), so the .vcxproj for each project including this 
file must be modified according to the directions in the WPP.targets file in the 
solution directory, which will cause the TRACEWPP.exe program to create the .TMH 
files for each .CPP file. The Additional Include Directories property 
(C++->General) for the project should be modified to specify $(IntDir), so the 
.TMH files are found.

### Executables

The executables for all projects are in the x64 directory tree. I have not 
tried to make any of this stuff to run as 32-bit executables.

## Sponsorship

This work was sponsored by the U.S. Defenese Advanced Projects Agency (DARPA) under contract
N6600118C4034.

Tejas Patel
Program Manager
DARPA/I2O

Original release: September 8, 2020 DISTAR Case 33398

DISTRIBUTION A (Approved for Public Release, Distribution Unlimited)
