import java.util.Arrays;

public class Maximum_Sum_Rectangle {
    public static int maxSumRectangle(int r, int c, int table[][]) {
        int sum[] = new int[r];
        int maxSum = Integer.MIN_VALUE;

        for (int colStart = 0; colStart < c; colStart++) {
            Arrays.fill(sum, 0);
            for (int colEnd = 0; colEnd < c; colEnd++) {
                for (int row = 0; row < r; row++) {
                    sum[row] += table[row][colEnd];
                } 

                int currAns = kadane(sum);
                maxSum = Math.max(maxSum, currAns);
            }
        }

        return maxSum;
    }

    public static int kadane(int arr[]) {
        int maxSum = Integer.MIN_VALUE, sum = 0;
        
        for (int i : arr) {
            sum += i;
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        int table[][] = {
            { 1,  2, -1, -4, -20},
            {-8, -3,  4, -2,   1},
            {3, 8, 9, 1, 3},
            {-4, -1, 1, 7, -6},
            {-2, -3, 8, 1, -1}
        };
        System.out.println(maxSumRectangle(row, col, table));
    }
}
