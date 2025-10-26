import java.util.*;
public class LeetCode136 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(singleNumber(nums));

    }
    static int singleNumber(int[] nums){
        int result = 0;
        if(nums.length <= 1) return result += nums[0];

        for (int n : nums) {
            result ^= n;
        }
        return result;
    }
}
