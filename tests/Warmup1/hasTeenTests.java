package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class hasTeenTests {
    @Test
    public void testNotTeen() {
        Assert.assertFalse(hasTeen.hasTeen(2, 2, 2));
    }

    @Test
    public void test1Teen() {
        Assert.assertTrue(hasTeen.hasTeen(14, 2, 2));
    }

    @Test
    public void test2Teen() {
        Assert.assertTrue(hasTeen.hasTeen(14, 14, 20));
    }

    @Test
    public void testAllTeen() {
        Assert.assertTrue(hasTeen.hasTeen(14, 16, 18));
    }
}
