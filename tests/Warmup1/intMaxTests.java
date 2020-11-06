package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class intMaxTests {
    @Test
    public void testAMax() {
        Assert.assertEquals(3, intMax.intMax(3,2,1));
    }

    @Test
    public void testBMax() {
        Assert.assertEquals(3, intMax.intMax(1,3,2));
    }

    @Test
    public void testCMax() {
        Assert.assertEquals(6, intMax.intMax(2,4,6));
    }

    @Test
    public void testNoMax() {
        Assert.assertEquals(0, intMax.intMax(4,4,3));
    }
}
