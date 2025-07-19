import java.util.Arrays;

//1365. How Many Numbers Are Smaller Than the Current Number
public class LeetCode1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            int count = 0;
            for (int j = 0; j < nums.length ; j++) {
                if( nums[j] < nums[i]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}

