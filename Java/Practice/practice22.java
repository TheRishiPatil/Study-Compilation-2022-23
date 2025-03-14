import java.util.Arrays;
import java.util.Scanner;

public class practice22 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int hrs = sc.nextInt();
        int[] inside = new int[hrs];
        int[] outside = new int[hrs];
        int[] remaining = new int[hrs];
        for (int i = 0; i < hrs; i++) {
            inside[i] = sc.nextInt();
        }
        for (int i = 0; i < hrs; i++) {
            outside[i] = sc.nextInt();
        }
        for (int i = 1; i < hrs; i++) {
            remaining[0] = inside[0] - outside[0];
            remaining[i] = inside[i] - outside[i] + remaining[i - 1];
        }
        System.out.println(Arrays.toString(remaining));
    }
}
