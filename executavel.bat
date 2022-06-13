cls
SET CLASSPATH=.;antlr-4.9.3-complete.jar;%CLASSPATH%
java org.antlr.v4.Tool Gramatica.g4
javac *.java
java Main.java < input.txt > outputs/Code.java
javac outputs/Code.java
java outputs/Code.java
