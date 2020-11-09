package Array1;

public class fix23 {
    public int[] fix23(int[] nums) {
        if(nums[0] == 2 && nums[1] == 3) {
            int[] change1 = new int[3];
            change1[0] = nums[0];
            change1[1] = 0;
            change1[2] = nums[2];
            return change1;
        } else if(nums[1] == 2 && nums[2] == 3) {
            int[] change2 = new int[3];
            change2[0] = nums[0];
            change2[1] = nums[1];
            change2[2] = 0;
            return change2;
        } return nums;
    }

}
