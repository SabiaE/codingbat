package Logic1;

public class withoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1 + die2;
        if(noDoubles && die1 <6 && die2 <6 && die1 == die2) {
            return sum + 1;
        } else if(noDoubles && die1 == 6 && die2 == 6) {
            return 6 + 1;
        } else {
            return sum;
        }
    }

}
