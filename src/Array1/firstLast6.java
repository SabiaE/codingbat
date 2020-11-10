package Array1;

public class firstLast6 {
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6) {
            return true;
        }
        return nums[nums.length - 1] == 6;
    }

}
