
import java.util.*;

public class Non_Constructible_Change {
    public static int nonConstructibleChange(int[] coins) {
        int change = 0;
        Arrays.sort(coins);
        for (int i : coins) {
            if (i > change + 1) {
                return change + 1;
            }
            change += i;
        }
        return change + 1;
      }

      public static void main(String[] args) {
        int coins[] = {1, 1};
        System.out.println(nonConstructibleChange(coins));
      }
}
