Test: MarkdownParse.class MarkdownParseTest.class
	java -cp lib/*:. org.junit.runner.JUnitCore MarkdownParseTest

MarkdownParseTest.class: MarkdownParse.class MarkdownParseTest.java
	javac -cp lib/*:. MarkdownParseTest.java MarkdownParse.java

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java