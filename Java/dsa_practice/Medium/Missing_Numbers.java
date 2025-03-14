public class Missing_Numbers {
    public static int[] missingNumbers(int[] nums) {
        int[] temp = new int[nums.length + 2];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i] - 1] = -1;
        }
        int[] output = new int[2]; int idx = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != -1) {
                output[idx] = i + 1;
                idx++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 3};
        int[] ans = missingNumbers(arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
