package Warmup1;

import org.junit.Assert;
import org.junit.Test;

public class missingCharTests {
    @Test
    public void test() { Assert.assertEquals("kittn", missingChar.missingChar("kitten", 4));
    }

    @Test
    public void test2() { Assert.assertEquals("smile", missingChar.missingChar("smiles", 5));}
}
