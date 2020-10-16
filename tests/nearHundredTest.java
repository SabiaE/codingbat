import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class nearHundredTest {
    @Test
    public void testFalseHigh() { assertFalse(nearHundred.nearHundred(150)); }

    @Test
    public void testFalseLow() { assertFalse(nearHundred.nearHundred(55)); }

    @Test
    public void testTrue100() { assertTrue(nearHundred.nearHundred(108));}

    @Test
    public void testTrue200() { assertTrue(nearHundred.nearHundred(195));}
}
