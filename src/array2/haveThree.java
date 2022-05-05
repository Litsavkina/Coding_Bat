package array2;

public class haveThree {
    /*

Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
     */

    public static boolean haveThree(int[] nums) {

        boolean hasThree = false;

        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i] == 3)
                hasThree = true;

            if(hasThree && nums[i+1] == 3)
                return true;
        }
        return false;
    }


    public static void main(String[] args) {

        int [] arr = {3, 1, 3, 3};
        System.out.println(haveThree(arr));


    }

}
