package Logic1;

public class caughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (speed <=60 || (isBirthday && speed <=65))
            return 0;
        if (speed >=61 && speed <=80 || (isBirthday && speed >=66 && speed <=85))
            return 1;
        else
            return 2;
    }

}
