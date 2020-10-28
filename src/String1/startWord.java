package String1;

public class startWord {
    public String startWord(String str, String word) {
        int a = str.indexOf(word);
        int b = str.indexOf(word.substring(1));
        if(a == 0) {
            return word;
        } else if(b == 1) {
            return str.substring(0,1) + word.substring(1);
        } else if (word.length()<=1 && str.length()>=1) {
            return str.substring(0,1);
        } return "";
    }

}
