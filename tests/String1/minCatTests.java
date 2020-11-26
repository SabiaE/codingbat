package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class minCatTests {

    @Test
    public void testSameLength() {
        assertEquals("CodeHigh", minCat.minCat("Code", "High"));
    }

    @Test
    public void testAIsLonger() {
        assertEquals("ellojava", minCat.minCat("hello", "java"));
    }

    @Test
    public void testBIsLonger() {
        assertEquals("javaello", minCat.minCat("java", "hello"));
    }


}
