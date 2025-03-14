package Practice_op;

import java.util.Scanner;

public class practice32 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int total = 0, temp = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > temp) {
                temp = a[i];
            }
            else{
                total += temp - a[i];
            }
        }   
        System.out.println(total);
    }
}