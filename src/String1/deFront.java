package String1;

public class deFront {
    public static String deFront(String str) {
        if((str.length() >= 2) && (str.substring(0,1).equals("a") && str.substring(1,2).equals("b"))) {
            return str;
        } else if ((str.length() >= 2) &&str.substring(1,2).equals("b")) {
            return str.substring(1);
        } else if ((str.length() >=1) && str.substring(0,1).equals("a")) {
            return str.substring(0,1) + str.substring(2);
        } else {
            return str.substring(2);
        }
    }

}
