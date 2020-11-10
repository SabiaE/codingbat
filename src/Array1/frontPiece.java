package Array1;

public class frontPiece {
    public int[] frontPiece(int[] nums) {
        if(nums.length >=2) {
            int[] front = new int[2];
            front [0] = nums [0];
            front [1] = nums [1];
            return front;
        } return nums;
    }

}
