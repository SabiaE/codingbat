package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class seeColorTests {

    @Test
    public void testRed() {
        assertEquals("red", seeColor.seeColor("redHerring"));
    }

    @Test
    public void testBlue() {
        assertEquals("blue", seeColor.seeColor("bluetimes"));
    }

    @Test
    public void testNoColour() {
        assertEquals("", seeColor.seeColor("notRed"));
    }

    @Test
    public void testTooShort() {
        assertEquals("", seeColor.seeColor("Hi"));
    }
}
