package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class stringETests {
    @Test
    public void test1E() {
        Assert.assertTrue(stringE.stringE("leaf"));
    }

    @Test
    public void testMoreEs() {
        Assert.assertTrue(stringE.stringE("leverage"));
    }

    @Test
    public void testTooManyEs() {
        Assert.assertFalse(stringE.stringE("very merry terry gerry"));
    }

    @Test
    public void testNoEs() {
        Assert.assertFalse(stringE.stringE("nothing"));
    }
}
