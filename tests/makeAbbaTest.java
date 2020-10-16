import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class makeAbbaTest {
    @Test
    public void test() {
        assertEquals("hometimetimehome", makeAbba.makeAbba("home", "time"));
    }
}
