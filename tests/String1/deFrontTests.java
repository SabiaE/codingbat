package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class deFrontTests {
    @Test
    public void testAB() {
        assertEquals("abc", deFront.deFront("abc"));
    }

    @Test
    public void testBOnly() {
        assertEquals("by", deFront.deFront("xby"));
    }

    @Test
    public void testAOnly() {
        assertEquals("aay", deFront.deFront("away"));
    }

    @Test
    public void testNoAB() {
        assertEquals("va", deFront.deFront("java"));
    }
}
