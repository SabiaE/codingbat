package String1;

public class minCat {
    public static String minCat(String a, String b) {
        if (b.length() > a.length()) {
            int indexb = b.length() - a.length();
            String newb = b.substring(indexb);
            return a + newb;
        } else if (a.length() > b.length()) {
            int indexa = a.length() - b.length();
            String newa = a.substring(indexa);
            return newa + b;
        } else {
            return a + b;
        }

    }


}
