import java.util.Scanner;

public class p32_3 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            z[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Math.max(x[i], Math.max(y[i], z[i])));
        }
    }
}
