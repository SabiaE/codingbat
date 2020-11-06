package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class in3050Tests {
    @Test
    public void test3040() {
        Assert.assertTrue(in3050.in3050(35, 30));
    }

    @Test
    public void testOutsideRange() {
        Assert.assertFalse(in3050.in3050(25,35));
    }

    @Test
    public void test4050() {
        Assert.assertTrue(in3050.in3050(45, 46));
    }
}
