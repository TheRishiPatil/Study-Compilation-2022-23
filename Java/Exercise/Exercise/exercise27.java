package Exercise;
import java.util.*;

public class exercise27 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        inputthenprintSumandAverage(15);
    }

    public static void inputthenprintSumandAverage(double num) {
        System.out.println("Enter numbers: ");
        double sum = 0, avg = 0, count = 0;

        while (true) {
            boolean isInt = sc.hasNextInt();
            if (isInt) {
                num = sc.nextInt();
                sum += num;
                count++;
            } else {
                break;
            }
        }
        avg = sum / count;
        System.out.println("SUM = " + sum + ", AVG = " + avg);
        sc.nextLine();
    }
}