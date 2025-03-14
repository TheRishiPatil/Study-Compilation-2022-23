public class Find_Three_Largest_Numbers {
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] ans = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int i = 0; i < array.length; i++) {
            int curr = array[i];
            if (curr > ans[2]) {
                ans[0] = ans[1];
                ans[1] = ans[2];
                ans[2] = curr;
            } else if (curr > ans[1]) {
                ans[0] = ans[1];
                ans[1] = curr;
            } else if (curr > ans[0]) {
                ans[0] = curr;
            }
        }
        return ans;
    }
}
