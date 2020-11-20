package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class lastCharsTest {
    @Test
    public void test() {assertEquals("ls", lastChars.lastChars("last", "chars"));}

    @Test
    public void testABlank() {assertEquals("@o", lastChars.lastChars("", "Hello"));}

    @Test
    public void testBBlank() {assertEquals("H@", lastChars.lastChars("Hello", ""));}

    @Test
    public void testBothBlank() {assertEquals("@@", lastChars.lastChars("", ""));}

}
