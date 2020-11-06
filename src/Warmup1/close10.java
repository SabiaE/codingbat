package Warmup1;

public class close10 {
    public static int close10(int a, int b) {
        int differenceA = Math.abs(a - 10);
        int differenceB = Math.abs(b - 10);
        if(differenceA > differenceB) {
            return b;
        } else if(differenceA < differenceB) {
            return a;
        } else {
            return 0;
        }

    }

}
