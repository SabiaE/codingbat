package Warmup1;

public class loneTeen {
    public static boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
            return false;
        } else if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return true;
        }
        return false;
    }

}
