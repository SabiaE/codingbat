package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class parrotTroubleTests {
    @Test
    public void testInTrouble() {
        Assert.assertTrue(parrotTrouble.parrotTrouble(true, 5));
    }

    @Test
    public void testNotInTroubleHour() {
        Assert.assertFalse(parrotTrouble.parrotTrouble(true, 17));
    }

    @Test
    public void testNotInTroubleTalking() {
        Assert.assertFalse(parrotTrouble.parrotTrouble(false,24));
    }
}
