package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class lastTwoTests {
    @Test
    public void testAtLeast2() {
        assertEquals("codign", lastTwo.lastTwo("coding"));
    }

    @Test
    public void testLessThan2() {
        assertEquals("H", lastTwo.lastTwo("H"));
    }
}
