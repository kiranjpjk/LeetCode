import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        int k = 4;
//        k =k % num.length;
        reverse(num,0, num.length - 1);
        reverse(num, 0, k - 1);
        reverse(num, k, num.length-1);
        System.out.print(Arrays.toString(num));


    }
    static void reverse(int[] num, int start,int end){
        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
}
