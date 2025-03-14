import java.util.Arrays;
import java.util.Scanner;

public class p32_2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i] % a[0] == 0) {
                count++;
            }
        }
        if (count == n) {
            System.out.println(a[0]);
        } else {
            System.out.println("-1");
        }
    }
}