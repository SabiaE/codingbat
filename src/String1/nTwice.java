package String1;

public class nTwice {
    public static String nTwice(String str, int n) {
        String nFirst = str.substring(0, n);
        String nLast = str.substring(str.length()-n);
        return nFirst + nLast;
    }

}
