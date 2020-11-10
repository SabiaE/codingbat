package Logic1;

public class alarmClock {
    public String alarmClock(int day, boolean vacation) {
        String early = "7:00";
        String layIn = "10:00";
        if(day >0 && day <6 && !vacation) {
            return early;
        } else if((day >5 || day ==0) && vacation) {
            return "off";
        } return layIn;
    }

}
