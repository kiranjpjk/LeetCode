import java.util.Arrays;

//1. Two Sum
public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.print(Arrays.toString(ans));
    }
    static int[] twoSum(int[] nums, int target) {

//        int[] newarr = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] + nums[i+1] == target){
//                newarr[i] = nums[i];
//                newarr[i+1] = nums[i+1];
//                System.out.print("[" + newarr[i] + ",");
//                System.out.print(newarr[i+1] + "]");
//                break;
//            }
//        }
//        return newarr;
//    }
        for (int i = 0; i < nums.length; i++) { // outer loop
            for (int j = i + 1; j < nums.length; j++) { // inner loop
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // return indices
                }
            }
        }
        return new int[0]; // no match found (though one solution is guaranteed)
    }
}
