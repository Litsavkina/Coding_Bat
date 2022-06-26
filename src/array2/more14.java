package array2;

public class more14 {
    /*
    Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
     */

    public static boolean more14(int[] nums) {
        int countOnes = 0;
        int countFours = 0;

        if (nums.length == 0) {
            return false;
        }
        if (nums.length == 1) {
            return true;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                countOnes++;
            } else if (nums[i] == 4) {
                countFours++;
            }

        }
        if (countOnes > countFours) {
            return true;
        }
        return false;
    }

}
