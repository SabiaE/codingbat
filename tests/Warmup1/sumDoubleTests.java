package Warmup1;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class sumDoubleTests {
    @Test
    public void testDouble() {
        Assert.assertEquals(3, sumDouble.sumDouble(1, 2));
    }

    @Test
    public void testNotDouble() {
        Assert.assertEquals(8, sumDouble.sumDouble(2, 2));
    }
}
