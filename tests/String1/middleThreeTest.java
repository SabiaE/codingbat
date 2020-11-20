package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class middleThreeTest {
    @Test
    public void testLongerThan3() { assertEquals("and", middleThree.middleThree("Candy"));}

    @Test
    public void testShorterThan3() { assertEquals("Hi", middleThree.middleThree("Hi"));}
}
