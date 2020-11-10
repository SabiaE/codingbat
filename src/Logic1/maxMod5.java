package Logic1;

public class maxMod5 {
    public int maxMod5(int a, int b) {
        if(a == b) {
            return 0;
        } else if(a % 5 == b % 5 && b > a) {
            return a;
        } else if(a % 5 == b % 5 && a > b) {
            return b;
        } else if(a > b) {
            return a;
        } else {
            return b;
        }
    }

}
