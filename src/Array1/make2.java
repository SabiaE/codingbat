package Array1;

public class make2 {
    public int[] make2(int[] a, int[] b) {
        if(a.length >= 2) {
            int[] firsta = new int[2];
            firsta[0] = a[0];
            firsta[1] = a[1];
            return firsta;
        } else if(a.length == 1) {
            int[] first1 = new int[2];
            first1[0] = a[0];
            first1[1] = b[0];
            return first1;
        } else {
            int[] firstb = new int[2];
            firstb[0] = b[0];
            firstb[1] = b[1];
            return firstb;
        }
    }

}
