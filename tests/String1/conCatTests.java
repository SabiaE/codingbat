package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class conCatTests {

    @Test
    public void testBothEmpty() {
        assertEquals("", conCat.conCat("", ""));
    }

    @Test
    public void testOneEmpty() {
        assertEquals("Hi", conCat.conCat("Hi", ""));
    }

    @Test
    public void testSameChar() {
        assertEquals("abcat", conCat.conCat("abc", "cat"));
    }

    @Test
    public void testNotSameChar() {
        assertEquals("catdog", conCat.conCat("cat", "dog"));
    }
}
