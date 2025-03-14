package Comapany_Q;

import java.util.Arrays;
import java.util.Scanner;

public class RandomCompanyQ2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int diff = Integer.MAX_VALUE;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = x; i < n; i++) {
            if (a[i-1] - a[i-x] < diff) {
                diff = a[i-1] - a[i-x];
            }
        }
        System.out.println(diff);
    }
}