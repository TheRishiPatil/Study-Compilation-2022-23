package Practice_op;

import java.util.Scanner;

public class practice29 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = 1; i < Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total count is: " + count);
    }
}