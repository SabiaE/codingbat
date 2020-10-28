package String1;

public class extraEnd {
    public String extraEnd(String str) {
        String last2 = str.substring(str.length()-2, str.length());
        return last2 + last2 + last2;
    }

}
