//1672. Richest Customer Wealth

import java.util.Arrays;

public class LeetCode1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int rows = 0; rows < accounts.length; rows++) {
            int sum = 0;
            for (int cols = 0; cols < accounts[rows].length; cols++) {
                    sum += accounts[rows][cols];
                }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
