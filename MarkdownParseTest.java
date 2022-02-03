import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

public class MarkdownParseTest {

    List<String> strList;
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testBasic() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        strList = MarkdownParse.getLinks(contents);
        System.out.println(strList);

        assertEquals(this.strList, List.of("https://something.com", "some-page.html"));
    }
    @Test
    public void testInvalidFormat() throws IOException{
        Path fileName = Path.of("test2-file.md");
	    String contents = Files.readString(fileName);
        strList = MarkdownParse.getLinks(contents);
        System.out.println(strList);

        assertEquals(this.strList, List.of());
    }
    @Test
    public void test2() throws IOException{
        Path fileName = Path.of("test3-file.md");
	    String contents = Files.readString(fileName);
        strList = MarkdownParse.getLinks(contents);
        System.out.println(strList);

        assertEquals(this.strList, List.of("https://hello.com"));
    }
    @Test
    public void testInvalidLink() throws IOException{
        Path fileName = Path.of("test4-file.md");
	    String contents = Files.readString(fileName);
        strList = MarkdownParse.getLinks(contents);
        System.out.println(strList);

        assertEquals(this.strList, List.of());
    }
    @Test
    public void testfile2() throws IOException{
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        strList = MarkdownParse.getLinks(contents);
        System.out.println(strList);

        assertEquals(this.strList, List.of("https://something.com", "some-page.html"));
    }
    @Test
    public void testfile3() throws IOException{
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        strList = MarkdownParse.getLinks(contents);
        System.out.println(strList);

        assertEquals(this.strList, List.of());
    }
    @Test
    public void testfile4() throws IOException{
        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        strList = MarkdownParse.getLinks(contents);
        System.out.println(strList);

        assertEquals(this.strList, List.of());
    }
    @Test
    public void testfile5() throws IOException{
        Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        strList = MarkdownParse.getLinks(contents);
        System.out.println(strList);

        assertEquals(this.strList, List.of());
    }
    @Test
    public void testfile6() throws IOException{
        Path fileName = Path.of("test-file6.md");
	    String contents = Files.readString(fileName);
        strList = MarkdownParse.getLinks(contents);
        System.out.println(strList);

        assertEquals(this.strList, List.of("page.com"));
    }
    @Test
    public void testfile7() throws IOException{
        Path fileName = Path.of("test-file7.md");
	    String contents = Files.readString(fileName);
        strList = MarkdownParse.getLinks(contents);
        System.out.println(strList);

        assertEquals(this.strList, List.of());
    }
    @Test
    public void testfile8() throws IOException{
        Path fileName = Path.of("test-file8.md");
	    String contents = Files.readString(fileName);
        strList = MarkdownParse.getLinks(contents);
        System.out.println(strList);

        assertEquals(this.strList, List.of());
    }
    @Test
    public void testFail() {
        assertEquals(2,2);
    }
}