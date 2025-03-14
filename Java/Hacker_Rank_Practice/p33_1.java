import java.util.Scanner;

public class p33_1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int m = sc.nextInt();
        int count = 0;
        boolean ans = false;
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < m - 1; i++) {
            for (int j = 1; j < m; j++) {
                if (a[i] == b[j]) {
                    count++;
                }
            }
            if (a[i] == a[i + 1]) {
                if (i + 1 >= m / 2) {
                    ans = true;
                }
                break;
            }
        }
        if (ans == true) {
            System.out.println("0");
        } else if (count == 0) {
            System.out.println("-1");
        } else {
            System.out.println(count);
        }
    }
}