package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class mixStartTests {
    @Test
    public void testShortString() {
        Assert.assertFalse(mixStart.mixStart("Hi"));
    }

    @Test
    public void testLongString() {
        Assert.assertFalse(mixStart.mixStart("Hello"));
    }

    @Test
    public void testMixString() {
        Assert.assertTrue(mixStart.mixStart("mixer"));
    }
}
