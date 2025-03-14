import java.util.Arrays;

public class Sweet_And_Savory {
    public static int[] sweetAndSavory(int[] dishes, int target) {
        Arrays.sort(dishes);
        int[] ans = new int[2];
        ans[0] = 0;
        ans[1] = 0;
        int start = 0, end = dishes.length - 1;
        int diff = Integer.MIN_VALUE;
        
        if (dishes.length == 0 || dishes[start] > 0 || dishes[end] < 0) {
            return ans;
        }
        
        while (start < end && dishes[start] < 0 && dishes[end] > 0) {
            int sum = dishes[start] + dishes[end];
            if (sum > target) {
                end--;
            } else { 
              if (sum > diff) {
                    diff = sum;
                    ans[0] = dishes[start];
                    ans[1] = dishes[end];
                }
                start++;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-3, -5, 1, 7};
        int[] ans = sweetAndSavory(arr, 8);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
