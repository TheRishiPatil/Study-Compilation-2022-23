public class Longest_Common_Subsequence1 {
    // top-down approach
    public static void main(String[] args) {
        String str1 = "ABCAB"; int m = str1.length();
        String str2 = "AECB"; int n = str2.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lcs(m, n, str1, str2, dp));
    }
    // largest common subsequence:-
    public static int lcs(int m, int n, String str1, String str2, int dp[][]) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return dp[m][n] = lcs(m - 1, n - 1, str1, str2, dp) + 1;
        } else {
            return dp[m][n] = Math.max(lcs(m - 1, n, str1, str2, dp), lcs(m, n - 1, str1, str2, dp));
        }
    }
}
