package String1;

public class extraFront {
    public static String extraFront(String str) {
        if(str.length() >=2) {
            String sub = str.substring(0,2);
            return sub + sub + sub;
        } else {
            return str + str + str;
        }
    }

}
