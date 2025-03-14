
import java.util.*;

public class Chocolate_Distribution_Problem {
    public static int ans(int[] nums, int m) {
        Arrays.sort(nums);
        if (m == 0 || nums.length == 0) {
            return 0;
        }
        if (m > nums.length) {
            return -1;
        }
        int ans = 0, total = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < nums.length; i++) {
            int min = nums[i];
            int max = nums[i + m - 1];
            ans = max - min;
            if (total > ans) {
                total = ans;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[] nums = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.println(ans(nums, m));
    }
}