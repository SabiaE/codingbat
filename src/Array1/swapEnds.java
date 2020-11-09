package Array1;

public class swapEnds {
    public int[] swapEnds(int[] nums) {
        if(nums.length > 1) {
            int first = nums[0];
            int last = nums[nums.length-1];
            nums[0] = last;
            nums[nums.length-1] = first;
            return nums;
        } return nums;
    }

}
