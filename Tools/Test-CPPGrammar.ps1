#
# This will bring up the ANTLR grammar viewer. It must be run from the same directory containing the CPP14.g4 file
#

antlr4 CPP14.g4 -o java
cd .\java\
javac *.java
write-host "Enter text to parse, followed by <CTRL-Z> <ENTER>"
grun CPP14 translationunit -gui
cd ..
