package String1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class makeTagsTest {
    @Test
    public void test() {
        assertEquals("<tagging>testing</tagging>", makeTags.makeTags("tagging", "testing"));
    }
}
