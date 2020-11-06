package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class backAroundTests {

    @Test
    public void testString() { Assert.assertEquals("gtestingg", backAround.backAround("testing")); }

    @Test
    public void testEmptyString() { Assert.assertEquals("", backAround.backAround(""));}

    @Test
    public void testStringOf1() { Assert.assertEquals("aaa", backAround.backAround("a"));}
}
