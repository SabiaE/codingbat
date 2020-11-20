package String1;

public class right2 {
    public static String right2(String str) {
        if (str.length() > 2) {
            String sub = str.substring(str.length()-2);
            String rest = str.substring(0, str.length()-2);
            return sub + rest;
        } return str;
    }

}
