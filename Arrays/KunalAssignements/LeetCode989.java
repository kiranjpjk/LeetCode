//989. Add to Array-Form of Integer
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode989 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 0};
        int k = 34;
        System.out.println(addToArrayForm(nums, k));

    }

    static List<Integer> addToArrayForm(int[] nums, int k) {
        int number = 0;
        for (int num : nums) {
            number = number * 10 + num;
        }

        // Step 2: Add k
        number += k;

        // Step 3: Convert back to list
        List<Integer> list = new ArrayList<>();
        String str = String.valueOf(number);

        for (char c : str.toCharArray()) {
            list.add(c - '0');
        }

        return list;
    }
}
