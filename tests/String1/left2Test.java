package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class left2Test {
    @Test
    public void testLongerThan2() {assertEquals("lloHe",left2.left2("Hello")) ;}

    @Test
    public void testLength2() { assertEquals("Hi", left2.left2("Hi"));}
}
