public class Longest_Common_Subsequence2 {
    public static void main(String[] args) {
        String str1 = "ABCAB"; int m = str1.length() + 1;
        String str2 = "AECB"; int n = str2.length() + 1;
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 0;
        }
        String ans = "";
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        System.out.println(dp[str1.length()][str2.length()]);

        int i = m - 1, j = n - 1;
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                ans = str1.charAt(i - 1) + ans;
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        System.out.println(ans);
    }
}
