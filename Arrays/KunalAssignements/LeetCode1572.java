//1572. Matrix Diagonal Sum
public class LeetCode1572 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int ans = diagonalSum(mat);
        System.out.println(ans);

    }
    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;;
        for(int i = 0; i < n; i++){
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }
        if (n % 2 == 1){
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }
}
