package String1;

public class comboString {
    public static String comboString(String a, String b) {
        int along = a.length();
        int blong = b.length();
        if(along > blong) {
            return b + a + b;
        } else if (along < blong) {
            return a + b + a;
        } return "";
    }

}
