#
# This must be run from the directory containing the CPP14.gr grammar
#

antlr4 CPP14.g4 -o generated
antlr4 CPP14.g4 -o java
#antlr4 C.g4 -o generated
#antlr4 C.g4 -o java
antlr4 CLI.g4 -o generated
antlr4 CLI.g4 -o java
cd .\java\
javac *.java
