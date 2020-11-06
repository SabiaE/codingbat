package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class makes10Tests {
    @Test
    public void testA10() {
        Assert.assertTrue(makes10.makes10(10, 0));
    }

    @Test
    public void testNo10s(){
        Assert.assertFalse(makes10.makes10(2,7));
    }

    @Test
    public void testBoth10() {
        Assert.assertTrue(makes10.makes10(10,10));
    }

    @Test
    public void testSum10() {
        Assert.assertTrue(makes10.makes10(4,6));
    }
}
