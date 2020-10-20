import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class missingCharTests {
    @Test
    public void test() { assertEquals("kittn", missingChar.missingChar("kitten", 4));
    }

    @Test
    public void test2() { assertEquals("smile", missingChar.missingChar("smiles", 5));}
}
