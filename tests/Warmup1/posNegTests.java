package Warmup1;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class posNegTests {
    @Test
    public void test() {assertTrue(posNeg.posNeg(1, -1, false));}
    @Test
    public void test2() {assertFalse(posNeg.posNeg(1, -1, true));}
    @Test
    public void test3() {assertTrue(posNeg.posNeg(-1, -1, true));}
}
