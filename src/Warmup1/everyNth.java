package Warmup1;

public class everyNth {
    public static String everyNth(String str, int n) {
        String annoying = "";
        for (int i=0; i<str.length(); i=i+n) {
            annoying = annoying + str.substring(i, i+1);
        }  return annoying;
    }

}
