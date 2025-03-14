import java.util.Arrays;
import java.util.Collections;

public class Minimum_Numbers_Of_Coins_For_Change {
    public static int minNumberOfCoinsForChange1(int n, int[] denoms) { // my solution, its good but it wont work in some cases.
        if(n == 0) return 0;

        Integer[] arr2 = new Integer[denoms.length]; // all this just for reverse array
        for (int i = 0; i < denoms.length; i++) {
            arr2[i] = Integer.valueOf(denoms[i]);
        }
        Arrays.sort(arr2, Collections.reverseOrder());
        
        int sum = 0, count = 0;
        for (int i : arr2){
            if (i <= n) {
                while (true) {
                    if (sum < n){ 
                        sum += i;
                        count++;
                    } 
                    if (sum > n) { // if sum becomes greater than target value then just decrease the count and minus the number once
                        sum -= i;
                        count--;
                        break;
                    }
                    if (n == sum) return count;
                }
            }
        }
        return -1;
    }

    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int[] coins = new int[n+1];
        Arrays.fill(coins, Integer.MAX_VALUE);
        coins[0] = 0;
        for (int i : denoms) {
            for (int j = 0; j < coins.length; j++) {
                if (i <= j) {
                    if (coins[j - i] < Integer.MAX_VALUE){
                        coins[j] = Math.min(coins[j], coins[j - i] + 1);
                    }
                }
            }
        }
        return coins[n] == Integer.MAX_VALUE ? -1 : coins[n];
    }
}
