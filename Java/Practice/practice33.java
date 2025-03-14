package Practice_op;

import java.util.Scanner;

public class practice33{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int value = 1, count;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < (n - m) + 1; i++) {
            count = m;
            for (int j = i; j < (m + i); j++) {
            for (int k = j + 1; k < (m + i); k++) {
                if (a[j] == a[k]) {
                    count--;
                }
            }
            }
            if (count > value) {
                value = count;
            }
        }
        System.out.println(value);
    }
}