import java.util.Scanner;

public class p34_2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count1 = 0, count2 = 0, count3 = 0, diff = 0;
        diff = Math.max(n, m) - Math.min(n, m);
        for (int i = 1; i <= 6; i++) {
            if (i - 1 == n || i == n || i + 1 == n) {
                count1++;
            }
            if (i - 1 == m || i == m || i + 1 == m) {
                count3++;
            }
            if (diff % 2 == 0) {
                count2 = 1;
            }
        }
        System.out.println(count1 + " " + count2 + " " + count3);
    }
}
