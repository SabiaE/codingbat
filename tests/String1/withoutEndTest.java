package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class withoutEndTest {
    @Test
    public void testLongerThan2() {
        assertEquals("estin", withoutEnd.withoutEnd("testing"));
    }

    @Test
    public void testLength2() {
        assertEquals("", withoutEnd.withoutEnd("Hi"));
    }

}
