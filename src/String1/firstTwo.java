package String1;

public class firstTwo {
    public static String firstTwo(String str) {
        if(str.length() >=2) {
            return str.substring(0,2);
        } else {
            return str;
        }
    }

}
