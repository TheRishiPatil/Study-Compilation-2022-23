import java.util.Scanner;

public class practice13 {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a Number ");
        int a = sc.nextInt();
        sumDigitsInMyStyle(a);
        System.out.println(sumDigitsInSirStyle(a));
    }

    public static void sumDigitsInMyStyle(int number) { // My method is not work's on more than 3 digit numbers, So don't use it :/
        int n0, n1, n2;
        if (number < 10) {
        System.out.println("-1");
        } else{
            n0 = number / 100;
            n1 = ((number / 10) % 10);
            n2 = number % 10;
            number = n0 + n1 + n2;
        System.out.println(number);
        }
    }

    private static int sumDigitsInSirStyle(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digits = number % 10;
            sum += digits;
            number /= 10;
        }
        return sum;
    }
}
