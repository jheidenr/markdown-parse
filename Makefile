MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	javac -cp lib/*:. MarkdownParseTest.java MarkdownParse.java
	java -cp lib/*:. org.junit.runner.JUnitCore MarkdownParseTest

MarkdownParse.class: MarkdownParse.java
	javac Markdownparse.java