package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class withoutX2Tests {
    @Test
    public void test2XX() {
        assertEquals("Hi", withoutX2.withoutX2("xxHi"));
    }

    @Test
    public void testSecondX() {
        assertEquals("Hi", withoutX2.withoutX2("Hxi"));
    }

    @Test
    public void testFirstX() {
        assertEquals("Hi", withoutX2.withoutX2("xHi"));
    }

    @Test
    public void testNoX() {
        assertEquals("Hello", withoutX2.withoutX2("Hello"));
    }
}
