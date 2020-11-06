package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class close10Tests {

    @Test
    public void testBigB() {
        Assert.assertEquals(5, close10.close10(4, 5));
    }

    @Test
    public void testBigA() {
        Assert.assertEquals(7, close10.close10(7, 1));
    }

    @Test
    public void testSame() {
        Assert.assertEquals(0, close10.close10(5, 5));
    }
}
