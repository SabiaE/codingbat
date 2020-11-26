package String1;

public class withoutX2 {
    public static String withoutX2(String str) {
        if(str.length()>1 && str.substring(0,2).equals("xx")) {
            return str.substring(2);
        } else if (str.length()>1 && str.substring(1,2).equals("x")) {
            return str.substring(0,1) + str.substring(2);
        }
        else if(str.length()>0 && str.substring(0,1).equals("x")) {
            return str.substring(1);
        } else {
            return str;
        }
    }

}
