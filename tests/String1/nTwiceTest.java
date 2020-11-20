package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class nTwiceTest {
    @Test
    public void test1() { assertEquals("Ho", nTwice.nTwice("Hello", 1));}

    @Test
    public void test5() {assertEquals("HelloHello", nTwice.nTwice("Hello", 5));}
}
