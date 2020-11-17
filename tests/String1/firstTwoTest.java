package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class firstTwoTest {
    @Test
    public void testLengthMoreThan2() {
        assertEquals("te", firstTwo.firstTwo("testing"));
    }

    @Test
    public void testLengthLessThan2() {
        assertEquals("l", firstTwo.firstTwo("l"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", firstTwo.firstTwo(""));
    }
}
