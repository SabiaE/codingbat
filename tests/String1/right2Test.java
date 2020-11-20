package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class right2Test {
    @Test
    public void testLongerThan2() { assertEquals("loHel", right2.right2("Hello")); }

    @Test
    public void testLength2() { assertEquals("Hi", right2.right2("Hi")); }
}
