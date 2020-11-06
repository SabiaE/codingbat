package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class delDelTests {

    @Test
    public void testSmallString() { Assert.assertEquals("Boo", delDel.delDel("Boo"));}

    @Test
    public void testDelString() { Assert.assertEquals("aboy", delDel.delDel("adelboy"));}

    @Test
    public void testOtherStrings() { Assert.assertEquals("sunshine", delDel.delDel("sunshine"));}
}
