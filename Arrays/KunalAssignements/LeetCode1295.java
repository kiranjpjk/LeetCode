//1295. Find Numbers with Even Number of Digits
public class LeetCode1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;

            while (num > 0){
                count++;
                num /= 10;
            }
            if(count % 2 == 0){
                even++;
            }
        }
        return even;
    }
}
