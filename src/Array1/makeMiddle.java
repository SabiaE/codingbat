package Array1;

public class makeMiddle {

    public int[] makeMiddle(int[] nums) {
        int middle = nums.length/2;
        int[] newmiddle = new int[2];
        newmiddle[0] = nums[middle-1];
        newmiddle[1] = nums[middle];
        return newmiddle;
    }

}
