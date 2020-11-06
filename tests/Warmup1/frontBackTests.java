package Warmup1;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class frontBackTests {
    @Test
    public void test() { Assert.assertEquals("gonfusinc", frontBack.frontBack("confusing"));}

    @Test
    public void test2() { Assert.assertEquals("p", frontBack.frontBack("p"));}

}
