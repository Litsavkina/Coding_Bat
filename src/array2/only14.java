package array2;

public class only14 {
    /*
    Given an array of ints, return true if every element is a 1 or a 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
     */

    public static boolean only14(int[] nums) {

        // if (nums.length == 0){
        //   return true;
        // }


        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 1 && nums[i]!= 4){
                return false;
            }
        }


        return true;

    }


}
