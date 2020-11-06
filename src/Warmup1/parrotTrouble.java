package Warmup1;

public class parrotTrouble {
    public static boolean parrotTrouble(boolean talking, int hour) {
        if(talking && (hour <7 || hour >20)) {
            return true;
        }
        return false;
    }

}
