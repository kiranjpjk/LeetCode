import java.util.Arrays;

// 832. Flipping an Image
public class LeetCode832 {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        int[][] ans = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row : image) {
            for (int i = 0; i < (n + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[n - 1 - i] ^ 1;
                row[n - 1 - i] = temp;
            }
        }
        return image;
    }
}
