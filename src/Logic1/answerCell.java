package Logic1;

public class answerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep) {
            return false;
        } else if(isMorning && isMom) {
            return true;
        } else if(isMorning) {
            return false;
        } else {
            return true;
        }
    }

}
