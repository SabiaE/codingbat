import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class notStringTests {
    @Test
    public void test() {
        assertEquals("not anything", notString.notString("anything"));
    }

    @Test
    public void test2() {
        assertEquals("not anything", notString.notString("not anything"));
    }
}

