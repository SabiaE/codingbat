package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class startWordTests {
    @Test
    public void testMatch() {
        assertEquals("hi", startWord.startWord("hippo", "hi"));
    }

    @Test
    public void testCloseMatch() {
        assertEquals("hip", startWord.startWord("hippo", "xip"));
    }

    @Test
    public void testWordLength1() {
        assertEquals("h", startWord.startWord("hippo", "i"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", startWord.startWord("", "hello"));
    }
}
