public class backAround {
    public String backAround(String str) {
        if(str.length()>=1) {
            char extra = str.charAt(str.length()-1);
            return extra + str + extra;
        }
        return str + str + str;
    }

}
