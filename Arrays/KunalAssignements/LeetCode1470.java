package Java_Learning.LeetCode;

import java.util.Arrays;

//1470. Shuffle the Array
public class LeetC1470 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] ans = (shuffle(nums, n));
        System.out.println(Arrays.toString(ans));


    }
    static int[] shuffle(int[] nums, int n) {
        int index = 0;
        int[] result = new int[2 * n];
        for (int i = 0; i < n ; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }
        return result;
    }
}