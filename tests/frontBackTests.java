import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class frontBackTests {
    @Test
    public void test() { assertEquals("gonfusinc", frontBack.frontBack("confusing"));}

    @Test
    public void test2() { assertEquals("p", frontBack.frontBack("p"));}

}
