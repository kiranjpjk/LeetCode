import java.util.Arrays;

//1304. Find N Unique Integers Sum up to Zero
//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class LeetCode1304 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    static int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;
        for (int i = 1; i <= n/2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }
        if(n % 2 == 1){
            result[index] = 0;
        }
        return result;
    }
}
