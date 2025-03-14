package Comapany_Q;

import java.util.*;

public class tcsQ2{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a); 
        Arrays.sort(b); 
        double c = a[n/2] + b[m/2];
        System.out.println(c/2);
    }
}