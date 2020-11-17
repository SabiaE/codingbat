package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class helloNameTest {
    @Test
    public void test1() {
        assertEquals("Hello Sabia!", helloName.helloName("Sabia"));
    }
}
