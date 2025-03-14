import java.util.Scanner;

public class p33_3 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i-1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}