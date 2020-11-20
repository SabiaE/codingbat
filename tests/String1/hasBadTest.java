package String1;

import org.junit.Test;

import static org.junit.Assert.*;

public class hasBadTest {
    @Test
    public void testStartsBad() { assertTrue( hasBad.hasBad("baddy") );}

    @Test
    public void testIndex1Bad() { assertTrue(hasBad.hasBad("abadman"));}

    @Test
    public void testNotBad() { assertFalse(hasBad.hasBad("Hello"));}

    @Test
    public void testShorterThan3() { assertFalse(hasBad.hasBad("Hi"));}
}
