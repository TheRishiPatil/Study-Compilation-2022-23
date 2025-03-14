import java.util.Scanner;

public class p31_3 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int temp1 = (x / 7);
        int min = temp1 * 2, max = min;
        int temp2 = x - (7 * temp1);
        if (temp1 == temp2) {
            max = min;
        }
        if (temp2 == 1) {
            max = min + 1;
        }
        if (temp2 > 1 && temp2 < 6) {
            max = min + 2;
        }
        if (temp2 == 6) {
            max = min + 2;
            min = min + 1;
        }
        System.out.println(min + " " + max);
    }
}