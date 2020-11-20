package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class withouEnd2Test {
    @Test
    public void testLongerThan2() { assertEquals("ell", withouEnd2.withouEnd2("Hello"));}

    @Test
    public void testLength2() { assertEquals("", withouEnd2.withouEnd2("Hi"));}
}
