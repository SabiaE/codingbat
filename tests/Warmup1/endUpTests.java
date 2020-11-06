package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class endUpTests {
    @Test
    public void testBigString() {
        Assert.assertEquals("bigGER", endUp.endUp("bigger"));
    }

    @Test
    public void testSmallString() {
        Assert.assertEquals("HI", endUp.endUp("Hi"));
    }
}
