import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class sleepInTest {
    @Test
    public void test() {assertFalse(sleepIn.sleepIn(true,false));}
    @Test
    public void test2() {assertTrue(sleepIn.sleepIn(true,true));}
    @Test
    public void test3() {assertTrue(sleepIn.sleepIn(false,true));}
    @Test
    public void test4() {assertTrue(sleepIn.sleepIn(false,false));}
}
