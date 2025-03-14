package Practice_op;

import java.util.Scanner;

public class practice31 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                if (i-j == 1) {
                    System.out.print("1");
                }
                else{
                    System.out.print("10");
                }
            }
        }
    }
}
