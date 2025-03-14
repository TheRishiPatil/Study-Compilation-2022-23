import java.util.Scanner;

public class p30_2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double x = sc.nextDouble();
        System.out.println((int) Math.ceil(x/5));
    }
}