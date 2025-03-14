import java.util.Scanner;

public class p30_3 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int ruby = 0, count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
		do {
            for (int i = 0; i < n; i++) {
                if (a[i] == 0 || b[i] == 0) {
                    System.out.println("0");
                } else {
                    ruby = (a[i] + b[i]) / 3;
                    System.out.println(ruby);
                }
            }
            count++;
        } while (count == n);
    }
}