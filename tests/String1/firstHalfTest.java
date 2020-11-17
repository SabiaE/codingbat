package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class firstHalfTest {
    @Test
    public void testEvenLength() {
        assertEquals("He", firstHalf.firstHalf("Help"));
    }
    @Test
    public void testOddLength() {
        assertEquals("Hello", firstHalf.firstHalf("Hello"));
    }
}
