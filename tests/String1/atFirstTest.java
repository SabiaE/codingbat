package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class atFirstTest {
    @Test
    public void testLongerThan2() { assertEquals("He", atFirst.atFirst("Hello"));}

    @Test
    public void testLength1() { assertEquals("H@", atFirst.atFirst("H"));}

    @Test
    public void testEmpty() { assertEquals("@@", atFirst.atFirst(""));}
}
