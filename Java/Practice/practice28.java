package Practice_op;

import java.util.Arrays;
import java.util.Scanner;

public class practice28 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = a;
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    System.out.print(j + 1 + " ");
                }
            }
        }
    }
}
