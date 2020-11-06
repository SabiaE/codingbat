package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class startOzTests {
    @Test
    public void testOz() {
        Assert.assertEquals("oz", startOz.startOz("ozark"));
    }

    @Test
    public void testZ() {
        Assert.assertEquals("z", startOz.startOz("azaz"));
    }

    @Test
    public void testO() {
        Assert.assertEquals("o", startOz.startOz("oslo"));
    }

    @Test
    public void testEmpty() {
        Assert.assertEquals("", startOz.startOz("l"));
    }
}
