package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class without2Tests {

    @Test
    public void testLongerThan2AndSame() {
        assertEquals("lloHe", without2.without2("HelloHe"));
    }

    @Test
    public void testLongerThan2NotSame() {
        assertEquals("HelloHi", without2.without2("HelloHi"));
    }

    @Test
    public void testLength2() {
        assertEquals("", without2.without2("Hi"));
    }
}
