public class Matrix_Palindrome {
    public static int matrixPalindrome(String str) {
        int length = str.length();
        int dp[][] = new int[length][length];

        for (int gap = 1; gap < length; gap++) {
            for (int row = 0, col = gap; row < length - gap; row++, col++) {
                if (isPalindrome(str, row, col)) {
                    dp[row][col] = 0;
                } else {
                    dp[row][col] = Integer.MAX_VALUE;
                    for (int i = row; i < col; i++) {
                        dp[row][col] = Math.min(dp[row][col], dp[row][i] + dp[i + 1][col] + 1);
                    }
                }
            }
        }
        return dp[0][length-1];
    }

    public static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcdcb";
        System.out.println(matrixPalindrome(str));
    }
}
