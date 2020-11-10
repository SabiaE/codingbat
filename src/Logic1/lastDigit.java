package Logic1;

public class lastDigit {
    public boolean lastDigit(int a, int b, int c) {
        int aEnd = a % 10;
        int bEnd = b % 10;
        int cEnd = c % 10;
        return(aEnd == bEnd || bEnd == cEnd || aEnd == cEnd);
    }

}
