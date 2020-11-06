package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class diff21Tests {

    @Test
    public void testMoreThan21() {
        Assert.assertEquals(8, diff21.diff21(25));
    }

    @Test
    public void testLessThan21() {
        Assert.assertEquals(17, diff21.diff21(4));
    }
}
