package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class icyHotTests {
    @Test
    public void testIsIcyHot() {
        Assert.assertTrue(icyHot.icyHot(-10, 200));
    }

    @Test
    public void testNotIcyHot() {
        Assert.assertFalse(icyHot.icyHot(10,200));
    }

    @Test
    public void testIsHotIcy() {
        Assert.assertTrue(icyHot.icyHot(200, -10));
    }
}
