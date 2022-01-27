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
}