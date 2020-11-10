package Array1;

public class front11 {
    public int[] front11(int[] a, int[] b) {
        if(a.length>0 && b.length<1) {
            int[] a1 = new int[1];
            a1[0] = a[0];
            return a1;
        } else if(a.length<1 && b.length>0) {
            int[] b1 = new int[1];
            b1[0] = b[0];
            return b1;
        } else if(a.length>0 && b.length>0) {
            int[] frontab = new int[2];
            frontab[0] = a[0];
            frontab[1] = b[0];
            return frontab;
        } else {
            return a;
        }
    }

}
