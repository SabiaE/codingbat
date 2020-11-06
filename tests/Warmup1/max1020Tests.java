package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class max1020Tests {
    @Test
    public void testABiggerInRange() {
        Assert.assertEquals(19, max1020.max1020(19,18));
    }

    @Test
    public void testBBiggerInRange() {
        Assert.assertEquals(19, max1020.max1020(18,19));
    }

    @Test
    public void testOnlyAInRangeNotBigger() {
        Assert.assertEquals(19, max1020.max1020(19, 22));
    }

    @Test
    public void testOnlyBInRangeNotBigger() {
        Assert.assertEquals(14, max1020.max1020(25, 14));
    }

    @Test
    public void testOutOfRange() {
        Assert.assertEquals(0, max1020.max1020(2,4));
    }
}
