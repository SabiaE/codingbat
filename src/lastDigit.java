public class lastDigit {
    public boolean lastDigit(int a, int b) {
        int diffA = a % 10;
        int diffB = b % 10;
        return(diffA == diffB);
    }

}
