import java.util.Arrays;

public class Knapsack_Problem {
    public static void main(String[] args) {
        int items = 4;        
        int weight = 10;
        int[] wt = {5, 4, 6, 3};
        int[] val = {10, 40, 30, 50};
        int[][] ans = new int[items + 1][weight + 1];

        for (int i = 0; i <= items; i++){
            ans[i][0] = 0;
        }
        for (int i = 0; i <= weight; i++) {
            ans[0][i] = 0;
        }

        // main logic
        for (int item = 1; item <= items; item++) {
            for (int capacity = 1; capacity <= weight; capacity++) {
                int withoutCurr = ans[item - 1][capacity];
                int withCurr = 0;

                if (capacity >= wt[item - 1]) {
                    withCurr = val[item - 1];

                    int remaining = capacity - wt[item - 1];
                    withCurr += ans[item - 1][remaining];
                }

                ans[item][capacity] = Math.max(withoutCurr, withCurr);
            }
        }

        System.out.println(ans[items][weight]);
        for (int sub[]: ans) {
            for (int i : sub) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
