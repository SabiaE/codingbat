import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class monkeyTroubleTest {
    @Test
    public void test() {
        assertFalse(monkeyTrouble.monkeyTrouble(true, false));
    }

    @Test
        public void test2 () {
            assertTrue(monkeyTrouble.monkeyTrouble(true, true));
        }

    @Test
    public void test3 () {
        assertTrue(monkeyTrouble.monkeyTrouble(false, false));
    }

    @Test
    public void test4 () {
        assertFalse(monkeyTrouble.monkeyTrouble(false, true));
    }

    }