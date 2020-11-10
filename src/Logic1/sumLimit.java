package Logic1;

public class sumLimit {
    public int sumLimit(int a, int b) {
        String aa = String.valueOf(a);
        String sum = String.valueOf(a + b);
        if(sum.length() > aa.length()) {
            return a;
        } else {
            return a + b;
        }
    }

}
