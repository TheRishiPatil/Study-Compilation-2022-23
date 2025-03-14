import java.util.Scanner;

public class p27_3 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] c = new int[n];
        int count1 = 0, count2 = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                c[i] = sc.nextInt();
                if (c[i] == c[1]) {
                    count1++;
                }
                if (c[i] == c[0]) {
                    count2++;
                }
            }
            if (count1 == count2) {
                System.out.println("YES");
                System.out.print(c[0] + " " + c[1]);
            } else {
                System.out.println("NO");
            }
        }
    }
}