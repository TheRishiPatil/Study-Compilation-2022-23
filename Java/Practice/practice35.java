package Practice_op;

import java.util.Scanner;

public class practice35 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        if (a.length == b.length) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + b[i] + " ");
                if (count % 3 == 0) {
                    System.out.println();
                }
                count++;
            }
        }
    }
}