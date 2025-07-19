//1732. Find the Highest Altitude
public class LeetCode1732 {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};//[0,-4,-7,-9,-10,-6,-3,-1]
        int ans = largestAltitude(gain);
        System.out.println(ans);

    }
    static int largestAltitude(int[] gain) {
        int n = gain.length;
        int height = 0;
        int max = 0;
        for (int j : gain) {
            height += j;
            max = Math.max(max, height);
        }
        return max;
    }
}
