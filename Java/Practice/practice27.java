package Practice_op;

import java.util.Scanner;

public class practice27 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0, temp = n/2 + 1;
        if (y == temp) {
            count = 0;
        }
        if (y > temp) {
            if (x != 1) {
                count = x - 1;
            }
            for (int i = y + 1; i <= n; i++) {
                count++;
            }
        }
        if (y < temp) {
            if (x != 1) {
                count = x - 1;
            }
            for (int i = x + 1; i < y; i++) {
                count++;
            }
        }
        System.out.println(count);
    }
}
