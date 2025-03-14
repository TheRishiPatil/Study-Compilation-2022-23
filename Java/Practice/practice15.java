import java.util.*;

public class practice15 {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // My_style();
        Tim_sir();
    }

    public static void My_style() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter the " + i + "th number = ");
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("Total of all numbers is " + sum);
    }

    public static void Tim_sir() {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;

        while (true) {
            int order = count + 1;
            System.out.print("Enter the " + order + "th number = ");

            boolean isAnInt = sc.hasNextInt();
            if (isAnInt) {
                int num = sc.nextInt();
                count ++;
                sum += num;
                if (count == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            sc.nextLine();
        }
        System.out.println("Total of all numbers is " + sum);
        sc.close();
    }
}
