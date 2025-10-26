//https://leetcode.com/problems/minimum-size-subarray-sum/description/
//209. Minimum Size Subarray Sum
public class LeetCode209 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int ans = minSubArrayLen(target,nums);
        System.out.println(ans);
    }
    static int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while(sum >= target){
                minLength = Math.min(minLength,end-start + 1);
                sum -= nums[start];
                start++;
                }
            }
        if(minLength == Integer.MAX_VALUE) {
            return 0;
        } else{
            return minLength;
        }
    }
}
