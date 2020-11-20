package String1;

public class endsLy {
    public static boolean endsLy(String str) {
        if(str.length()>1) {
            String end = str.substring(str.length()-2);
            return (end.equals("ly"));
        } return false;
    }

}
