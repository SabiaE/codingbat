package String1;

public class left2 {
    public static String left2(String str) {
        if (str.length() >2) {
            return str.substring(2) + str.substring(0,2);
        } else {
            return str;
        }
    }

}
