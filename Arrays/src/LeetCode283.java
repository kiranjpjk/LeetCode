import java.util.Arrays;
//283. Move Zeroes
public class LeetCode283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] ans = moveZeroes(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] moveZeroes(int[] nums) {
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] != 0) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
            }
        }
        return nums;
    }
}

