package array2;

public class CenteredAverage {
    /*
    Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.


centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
     */

    public static int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums [0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(min, nums[i]);
            max = Math.max(max,nums[i]);
        }

        return (sum - min - max) / (nums.length -2);
    }


    public static void main(String[] args) {
        int[] num = {1, 1, 5, 5, 10, 8, 7};

        System.out.println(centeredAverage(num));
    }
}

/*
        int max = nums[0]; // skip the max value in the loop
        int min = nums [0];
        int avr = 0;

        for (int each : nums) {

            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }

        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max || nums[i] == min){
                continue;
            }
            avr += nums[i];

            }
        return avr / (nums.length - 2) ;

 */