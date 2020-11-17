package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class comboStringTest {
    @Test
    public void testAIsLonger() {
        assertEquals("shortlongershort", comboString.comboString("longer", "short"));
    }

    @Test
    public void testBIsLonger() {
        assertEquals("shortlongershort", comboString.comboString("short", "longer"));
    }

    @Test
    public void testAIsEmpty() {
        assertEquals("Hello", comboString.comboString("", "Hello"));
    }

    @Test
    public void testBothEmptyStrings() {
        assertEquals("", comboString.comboString("", ""));
    }
}
