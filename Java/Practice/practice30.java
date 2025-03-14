package Practice_op;

import java.util.Scanner;

public class practice30 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int count = 0, tempcount = 0, size = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i + 1; j < n; j++) {
                do {
                    if (a[i] != a[j]) {
                        count++;
                    }
                    size++;
                } while (size == m);
            }
            if (tempcount < count) {
                tempcount = count;
            }
        }
        System.out.println(tempcount);
    }
}
