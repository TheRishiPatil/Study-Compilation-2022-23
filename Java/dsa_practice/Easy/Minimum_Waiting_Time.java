// package dsa_practice;
import java.util.Arrays;

public class Minimum_Waiting_Time {
    public static int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries); int sum = 0, total = 0;
        for (int i = 0; i < queries.length - 1; i++) {
            sum += queries[i];
            total += sum;
        }
        return total;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 5};
        System.out.println(minimumWaitingTime(arr));
    }
}
