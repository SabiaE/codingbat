package Array1;

public class maxEnd3 {
    public int[] maxEnd3(int[] nums) {
        if(nums[0] > nums[2]) {
            int[] first = new int[3];
            first[0] = nums[0];
            first[1] = nums[0];
            first[2] = nums[0];
            return first;
        } else if(nums[2] > nums[0]) {
            int[] last = new int[3];
            last[0] = nums[2];
            last[1] = nums[2];
            last[2] = nums[2];
            return last;
        } else {
            int[] same = new int[3];
            same[0] = nums[0];
            same[1] = nums[0];
            same[2] = nums[0];
            return same;
        }
    }

}
