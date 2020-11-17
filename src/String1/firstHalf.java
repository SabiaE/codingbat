package String1;

public class firstHalf {
    public static String firstHalf(String str) {
        int n = str.length();
        String sub = str.substring(0,(n/2));
        if ((n % 2 == 0) || (n == 2)) {
            return sub;
        } else {
            return str;
        }
    }

}
