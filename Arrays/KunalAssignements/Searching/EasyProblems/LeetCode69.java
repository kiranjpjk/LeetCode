package Searching.EasyProblems;
//69. Sqrt(x)
//https://leetcode.com/problems/sqrtx/description/
public class LeetCode69 {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(mySqrt(num));
    }
    static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int start = 0, end = x, ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            long sq = (long) mid * mid;
            if(sq == x){
                return  mid;
            } else if (sq < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
