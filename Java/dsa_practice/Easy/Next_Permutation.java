

public class Next_Permutation {
    public static void nextPermutation(int[] nums) {
        int idx1 = -1, idx2 = -1;
        int n = nums.length;
        for(int i = n - 2; i >= 0; i--){
            if (nums[i] < nums[i+1]) {
                idx1 = i;
                break;
            }
        }
        for(int i = n - 1; i >= idx1; i--){
            if (nums[i] > nums[idx1]) {
                idx2 = i;
                break;
            }
        }

        swap(idx1, idx2, nums);

        reverse(nums, idx1, n);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static void swap(int idx1, int idx2, int[] nums){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    static void reverse(int[] nums, int idx1, int n){
        n = n - 1;
        idx1 = idx1 + 1;
        while(idx1 < n){
            swap(idx1, n, nums);
            idx1++;
            n--;
        }
    }   
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 4, 2};
        nextPermutation(nums);
    }
}
