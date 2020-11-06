package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class lastDigitTests {
    @Test
    public void testSameDifference() {
        Assert.assertTrue(lastDigit.lastDigit(83,13));
    }

    @Test
    public void testDifferent() {
        Assert.assertFalse(lastDigit.lastDigit(19,20));
    }
}
