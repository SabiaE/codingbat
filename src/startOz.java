public class startOz {
    public String startOz(String str) {

        if((str.length()>1) && str.substring(0,2).equals("oz")) {
            return str.substring(0,2);

        } else if((str.length()>1) && str.substring(1,2).equals("z")){
            return str.substring(1,2);

        } else if((str.length()>0) && str.substring(0,1).equals("o")) {
            return str.substring(0,1);
        }
        return "";
    }

}
