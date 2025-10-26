import java.util.*;
public class LeetCode191 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(hammingWeight(n));
    }
    static int hammingWeight(int n) {
        int result = 0;
        while (n != 0){
            n = n & (n - 1);
            result += 1;
        }
        return result;
    }
}
