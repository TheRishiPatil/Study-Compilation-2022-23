import java.util.Scanner;

public class p30_1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int[] b = new int[x];
        int temp1 = 0;
        int temp2 = 0;
        int num = 0;
        for (int i = 0; i < x-1; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < x; i++) {
            temp1 += b[i];
            temp2 += i + 1;
        }
        num = temp2 - temp1;
        System.out.println(num);
    }
}