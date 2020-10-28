package String1;

public class middleThree {
    public String middleThree(String str) {
        if(str.length() >3) {
            int index = (str.length()/2 -1);
            return str.substring(index, index+3);
        } else {
            return str;
        }
    }

}
