package String1;

public class conCat {
    public String conCat(String a, String b) {
        if(a.length()<1 || b.length()<1) {
            return a+b;
        }
        else if(a.substring(a.length()-1).equals(b.substring(0,1))) {
            return a.substring(0, a.length()-1) + b;
        } else {
            return a + b;
        }
    }

}
