package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class or35Tests {
    @Test
    public void testMod5() {
        Assert.assertTrue(or35.or35(10));
    }

    @Test
    public void testMod3() {
        Assert.assertTrue(or35.or35(9));
    }

    @Test
    public void testBoth35() {
        Assert.assertTrue(or35.or35(15));
    }

    @Test
    public void testNo3Or5() {
        Assert.assertFalse(or35.or35(7));
    }
}
