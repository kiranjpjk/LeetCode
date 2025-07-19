package Java_Learning.LeetCode;
//832. Flipping an Image
public class LeetC832 {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

    }
    static  int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            int start = 0;
            int end = row.length - 1;

            while(start < end){
                int temp = row[start];
                row[start] = row[end];
                row[end] = temp;

                start++;
                end--;
            }
        }
        for(int[] row : image){
            for(int[] col : image){
                image[row][col] ^= 1;
            }
        }
        return ;
    }
}
