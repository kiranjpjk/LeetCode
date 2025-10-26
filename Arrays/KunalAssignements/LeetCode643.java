//https://leetcode.com/problems/maximum-average-subarray-i/description/
//643. Maximum Average Subarray I
public class LeetCode643 {
    public static void main(String[] args) {
        int[] nums = {4,0,4,3,3};
        int k = 5;
        double answer = findMaxAverage(nums,k);
        System.out.println(answer);

    }
    static double findMaxAverage(int[] nums, int k) {
        double windowsSum = 0;
        for (int i = 0; i < k; i++) {
            windowsSum += nums[i];
        }
        double maxSum = windowsSum;
        for (int i = k; i < nums.length ; i++) {
            windowsSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowsSum);
        }
        return maxSum / k;
    }
}
