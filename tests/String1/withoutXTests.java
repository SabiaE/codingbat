package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class withoutXTests {
    @Test
    public void testEmptyString() {
        assertEquals("", withoutX.withoutX(""));
    }

    @Test
    public void testStartAndEndX() {
        assertEquals("Hi", withoutX.withoutX("xHix"));
    }

    @Test
    public void testStartsX() {
        assertEquals("Hi", withoutX.withoutX("xHi"));
    }

    @Test
    public void testEndsX() {
        assertEquals("Hxi", withoutX.withoutX("Hxix"));
    }

    @Test
    public void testNoX() {
        assertEquals("Hello", withoutX.withoutX("Hello"));
    }

    @Test
    public void test1X() {
        assertEquals("", withoutX.withoutX("x"));
    }
}
