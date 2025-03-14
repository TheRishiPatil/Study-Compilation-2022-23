package Comapany_Q;

import java.util.Scanner;

public class RandomCompanyQ1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n + 4];
        a[0] = a[1] = a[n] = a[n + 1] = 0;
        for (int i = 2; i < n + 2; i++) {
            a[i] = sc.nextInt();
        }
        int total = Integer.MIN_VALUE, num = 0;
        for (int i = 2; i < n + 2; i++) {
            if ((a[i-2] + a[i-1] + a[i+1] + a[i+2]) > total) {
                total = a[i-2] + a[i-1] + a[i+1] + a[i+2];
                num = i;
            }
        }
        System.out.println("{" + (num - 1) + ", " + total + "}" );
    }
}