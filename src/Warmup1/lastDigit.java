package Warmup1;

public class lastDigit {
    public static boolean lastDigit(int a, int b) {
        int diffA = a % 10;
        int diffB = b % 10;
        return(diffA == diffB);
    }

}
