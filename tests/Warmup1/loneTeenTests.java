package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class loneTeenTests {
    @Test
    public void testLonelyTeen() {
        Assert.assertTrue(loneTeen.loneTeen(13,20));
    }

    @Test
    public void test2Teens() {
        Assert.assertFalse(loneTeen.loneTeen(13, 13));
    }

    @Test
    public void testNoTeens() {
        Assert.assertFalse(loneTeen.loneTeen(1,2));
    }
}
