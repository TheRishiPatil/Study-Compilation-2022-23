import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class p32_1 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String str = sc.next();
        String[] b = str.split(",");
        int[] a = new int[n];
        int[] c = new int[n];
        int count = 1;

        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(b[i]);
            c[i] = Math.abs(a[i]);
        }

        Arrays.sort(c);
        for (int i = 1; i < n; i++) {
            if (c[i] % c[i - 1] == 0) {
                count++;
            }
        }
        if (count == n) {
            System.out.println("FRIENDS");
        } else {
            System.out.println("NOT FRIENDS");
        }
    }
}