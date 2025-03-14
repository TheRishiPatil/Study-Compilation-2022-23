import java.util.Arrays;

public class palindrome {
    public static int minCoins(int total, int coins[]) { // normal way O (m ^ n) where m is number of ans and n is the number of coins
        if (total <= 0) { // ans --> minimum coins that equal to total coin
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if (total - coins[i] >= 0) {
                int subAns = minCoins(total - coins[i], coins);
                ans = Math.min(ans, subAns + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int total = 18;
        int coins[] ={1, 5, 7};
        int dp[] = new int[total + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        
        System.out.println(minCoins(total, coins, dp));
    }

    public static int minCoins(int total, int coins[], int dp[]) { // dynamic programming way (m.n) because we store ans value so that we don't need to solve same ans multiple times
        if (total <= 0) return 0;
        int ans = Integer.MAX_VALUE;

        for (int coin : coins) {
            if (total - coin >= 0) {
                int subAns = 0;
                if (dp[total - coin] != -1) {
                    subAns = dp[total - coin];
                } else {
                    subAns = minCoins(total - coin, coins, dp);
                }
                ans = Math.min(ans, subAns + 1);
            }
        }

        return dp[total] = ans;
    }
}
