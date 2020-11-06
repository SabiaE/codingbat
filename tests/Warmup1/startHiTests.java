package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class startHiTests {
    @Test
    public void testDoesStartHi() {
        Assert.assertTrue(startHi.startHi("hilly"));
    }

    @Test
    public void testShortString() {
        Assert.assertFalse(startHi.startHi("h"));
    }

    @Test
    public void testNotHi() {
        Assert.assertFalse(startHi.startHi("Flat"));
    }
}
