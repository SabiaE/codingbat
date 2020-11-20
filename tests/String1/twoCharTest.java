package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class twoCharTest {
    @Test
    public void test1() { assertEquals("lo", twoChar.twoChar("Hello", 3));}

    @Test
    public void testOutOfRange() { assertEquals("He", twoChar.twoChar("Hello", 9));}
}
