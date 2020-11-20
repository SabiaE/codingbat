package String1;

import org.junit.Test;

import static org.junit.Assert.*;

public class endsLyTest {
    @Test
    public void testLongerThan1(){ assertTrue( endsLy.endsLy("oddly"));}

    @Test
    public void testEmpty() { assertFalse( endsLy.endsLy(""));}

    @Test
    public void testDoesntEndLy() { assertFalse(endsLy.endsLy("Hello"));}

}


