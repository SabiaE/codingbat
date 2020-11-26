package String1;

public class withoutX {
    public static String withoutX(String str) {
        if(str.length() == 0){
            return str;
        }

        if(str.length() >1) {
            String front = str.substring(0,1);
            String end = str.substring(str.length()-1);

            if(front.equals("x") && end.equals("x")) {
                return str.substring(1,str.length()-1);
            }

            if(front.equals("x")) {
                return str.substring(1);
            }

            if(end.equals("x")) {
                return str.substring(0, str.length()-1);
            }

            else {
                return str;
            }

        }
        return "";
    }

}