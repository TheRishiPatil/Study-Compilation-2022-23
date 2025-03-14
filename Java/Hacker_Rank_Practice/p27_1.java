import java.util.Arrays;
import java.util.Scanner;

public class p27_1 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        // int k = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[i] = 1;
        }
        for (i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                b[i] = b[i] + b[i - 1];
            }
        }
        Arrays.sort(b);
        System.out.println(b[n - 1]);

    }
}
