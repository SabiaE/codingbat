package String1;

public class lastChars {
    public String lastChars(String a, String b) {
        if(a.length()>0 && b.length()>0) {
            return a.substring(0,1) + b.substring(b.length()-1);
        } else if (a.length()<1 && b.length()>0) {
            return "@" + b.substring(b.length()-1);
        } else if (a.length()>0 && b.length()<1) {
            return a.substring(0,1) + "@";
        } return "@@";
    }



}