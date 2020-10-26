public class endUp {
    public String endUp(String str) {
        if(str.length() >= 3) {
            String sub = str.substring(str.length()-3);
            String front = str.substring(0, str.length()-3);
            return front + sub.toUpperCase();
        } else {
            return str.toUpperCase();
        }
    }

}
