package String1;

public class withouEnd2 {
    public String withouEnd2(String str) {
        if (str.length() > 2) {
            return str.substring(1, str.length()-1);
        } else {
            return "";
        }
    }

}
