package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class in1020Tests {
    @Test
    public void test1In1020() {
        Assert.assertTrue(in1020.in1020(15, 9));
    }

    @Test
    public void test2in1020() {
        Assert.assertTrue(in1020.in1020(15,15));
    }

    @Test
    public void testOutOfRange() {
        Assert.assertFalse(in1020.in1020(50,2));
    }
}
