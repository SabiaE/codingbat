package Warmup1;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class notStringTests {
    @Test
    public void test() {
        Assert.assertEquals("not anything", notString.notString("anything"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("not anything", notString.notString("not anything"));
    }
}

