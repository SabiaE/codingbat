package Warmup1;

public class max1020 {
    public static int max1020(int a, int b) {

        if((a >=10 && a<=20) && a>b) {
            return a;
        }
        else if((b >=10 && b <=20) && b>a) {
            return b;
        }

        else if((a >=10 && a<=20) && (b<10 || b>20)) {
            return a;
        }

        else if((b >=10 && b <=20) && (a<10 || a>20)) {
            return b;

        } else {
            return 0;
        }
    }

}
