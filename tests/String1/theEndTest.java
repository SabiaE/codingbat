package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class theEndTest {
    @Test
    public void testTrue() { assertEquals("H", theEnd.theEnd("Hello", true) ); }

    @Test
    public void testFalse() { assertEquals("o", theEnd.theEnd("Hello", false));}
}
