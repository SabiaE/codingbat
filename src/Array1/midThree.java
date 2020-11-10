package Array1;

public class midThree {
    public int[] midThree(int[] nums) {
        int middle = nums.length/2;
        int[] newmiddle = new int[3];
        newmiddle[0] = nums[middle-1];
        newmiddle[1] = nums[middle];
        newmiddle[2] = nums[middle+1];
        return newmiddle;
    }
}
