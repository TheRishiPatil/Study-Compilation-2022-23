import java.util.Scanner;

public class p29_2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int temp1 = 0, temp2 = 0, temp3 = 0;
        int[] b = new int[x];
        for (int i = 0; i < x; i++) {
            b[i] = sc.nextInt();
            if (i < x / 2) {
                temp1 += b[i];
            } else {
                temp2 += b[i];
            }
        }
        if (temp1 + temp2 == 360) {
            temp3 = Math.max(temp1, temp2) - Math.min(temp1, temp2);
            System.out.println(temp3);
        }
    }
}
