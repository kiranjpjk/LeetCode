package Java_Learning.LeetCode;

import java.util.ArrayList;
import java.util.List;

//1431. Kids With the Greatest Number of Candies
public class LeetC1431 {
    public static void main(String[] args) {
        int[] candies = {2, 3, 7};
        int extracandies = 1;
        List<Boolean> ans = kidsWithCandies(candies, extracandies);
        System.out.println(ans);

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(); {
        int max = 0;
        for(int candy : candies){
            if( candy > max){
                max = candy;
            }
        }
        for(int candy : candies){
            result.add(candy + extraCandies >= max/2);
        }
        return result;
        }
    }
}
