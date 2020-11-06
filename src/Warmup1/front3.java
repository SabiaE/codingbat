package Warmup1;

public class front3 {
    public static String front3(String str) {
        if(str.length()>3) {
            return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
        }
        else {
            return str + str + str;
        }
    }

}
