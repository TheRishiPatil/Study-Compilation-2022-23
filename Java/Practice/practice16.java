import java.util.Scanner;

public class practice16 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        System.out.println("Enter Numbers:");
        while (true) {
            int num = sc.nextInt();
            Boolean isnum = sc.hasNextInt();
            if (!isnum) {
                System.out.println("Invalid Number");
                break;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min = " + min + ", Max = " + max);

    }
}