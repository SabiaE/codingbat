package String1;

public class lastTwo {
    public String lastTwo(String str) {
        if(str.length()>=2){
            String start = str.substring(0,str.length()-2);
            String second = str.substring(str.length()-2, str.length()-1);
            String last = str.substring(str.length()-1);
            return start + last + second;
        } return str;
    }

}
