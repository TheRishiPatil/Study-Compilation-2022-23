import java.util.Scanner;

public class p29_1 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int temp = 0, temp1 = 0, count = 0;
        for (int i = 1; i <= n; i++) {
        n -= temp1;
        if (i != temp) {
            temp = i;
            temp1 += i;
            count++;
        }
        if (i == temp) {
            for (int j = 1; j <= n; j++) {
                if (temp1 - j <= n) {
                    count++;
                }
            }
            // break;
        }
        }
        if (n == 1 || n == 2) {
            System.out.println("1");
        }else
        System.out.println(count);
    }
}
