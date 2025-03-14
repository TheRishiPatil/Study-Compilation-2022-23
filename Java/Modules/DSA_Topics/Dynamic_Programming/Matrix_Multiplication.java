public class Matrix_Multiplication {
    public static int matrixMultiplication(int n, int arr[]) {
        int dp[][] = new int[n][n];

        for (int length = 2; length < dp.length; length++) {
            for (int row = 0, col = length; row < n - length; row++, col++) {
                dp[row][col] = Integer.MAX_VALUE;
                for (int i = row + 1; i < col; i++) {
                    dp[row][col] = Math.min(dp[row][col], dp[row][i] + dp[i][col] + (arr[i] * arr[row] * arr[col]));
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {2, 3, 4, 1, 3};
        System.out.println(matrixMultiplication(n, arr));
    }
}
