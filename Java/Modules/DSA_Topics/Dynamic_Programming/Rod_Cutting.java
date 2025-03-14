public class Rod_Cutting {
    public static void main(String[] args) {
        int n = 8;
        int price[] = { 1, 5, 6, 9, 11, 12, 14, 16 };

        int dp[] = new int[n + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], price[j] + dp[i - j - 1]);
                System.out.print(dp[i] + " ");
            }
            System.out.println();
        }

        System.out.println(dp[n]);
    }
}
