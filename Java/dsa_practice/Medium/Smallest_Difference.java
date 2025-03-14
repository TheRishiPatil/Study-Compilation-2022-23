import java.util.Arrays;

public class Smallest_Difference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);        
        Arrays.sort(arrayTwo);
        int finali = 0, finalj = 0, i = 0, j = 0;
        int min = Integer.MAX_VALUE;
        while (i < arrayOne.length && j < arrayTwo.length) {
            int sum = Math.abs(arrayOne[i] - arrayTwo[j]);
            if (sum < min) {
                min = sum;
                finali = arrayOne[i];
                finalj = arrayTwo[j];
            }
            if (arrayOne[i] < arrayTwo[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] ans = {finali, finalj};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {-1, 5, 10, 20, 28, 3};
        int[] arr2 = {26, 134, 135, 15, 17};

        int[] ans = smallestDifference(arr1, arr2);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
