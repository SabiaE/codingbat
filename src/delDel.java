public class delDel {
    public String delDel(String str) {
        if(str.length()<4) {
            return str;
        } else if(str.substring(1,4).equals("del")) {
            String first = str.substring(0,1);
            String rest = str.substring(4);
            return first + rest;
        }
        return str;
    }

}
