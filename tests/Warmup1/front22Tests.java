package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class front22Tests {
    @Test
    public void testLength3() {
        Assert.assertEquals("HiHiHi", front22.front22("Hi"));
    }

    @Test
    public void testMoreThan3() {
        Assert.assertEquals("HeHelloHe", front22.front22("Hello"));
    }

    @Test
    public void testLessThan2() {
        Assert.assertEquals("AAA", front22.front22("A"));
    }
}
