package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class everyNthTests {

    @Test
    public void test1() {
        Assert.assertEquals("confusion", everyNth.everyNth("confusion", 1));
    }

    @Test
    public void testMore() {
        Assert.assertEquals("cun", everyNth.everyNth("confusion", 4));
    }

    @Test
    public void testEmpty() {
        Assert.assertEquals("", everyNth.everyNth("", 5));
    }
}
