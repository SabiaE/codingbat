package String1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class extraFrontTests {

    @Test
    public void testAtLeast2() {
        assertEquals("HeHeHe", extraFront.extraFront("Hello"));
    }

    @Test
    public void testLessThan2() {
        assertEquals("HHH", extraFront.extraFront("H"));
    }
}
