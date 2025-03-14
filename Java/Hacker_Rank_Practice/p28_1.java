import java.util.Scanner;

public class p28_1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == k) {
                    if (i > j) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
