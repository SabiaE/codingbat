package String1;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class frontAgainTests {

    @Test
    public void testTooShort() {
        assertFalse(frontAgain.frontAgain("H"));
    }

    @Test
    public void testIsTrue() {
        assertTrue(frontAgain.frontAgain("edited"));
    }

    @Test
    public void testNotTrue() {
        assertFalse(frontAgain.frontAgain("Hello"));
    }

}
