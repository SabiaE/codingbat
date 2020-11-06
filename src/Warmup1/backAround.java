package Warmup1;

public class backAround {
    public static String backAround(String str) {
        if(str.length()>=1) {
            char extra = str.charAt(str.length()-1);
            return extra + str + extra;
        }
        return str + str + str;
    }

}
