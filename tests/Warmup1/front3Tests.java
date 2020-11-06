package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class front3Tests {
    @Test
    public void testLessThan3() {
        Assert.assertEquals("HiHiHi", front3.front3("Hi"));
    }

    @Test
    public void testMoreThan3() {
        Assert.assertEquals("HelHelHel", front3.front3("Hello"));
    }
}
