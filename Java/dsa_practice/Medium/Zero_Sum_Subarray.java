import java.util.HashSet;

public class Zero_Sum_Subarray {
    public boolean zeroSumSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int currSum = 0;
        for (int i : nums) {
            currSum += i;
            if (i == 0 || currSum == 0 || !set.add(currSum)) {
                return true;
            }
        }
        return false;
    }
}
