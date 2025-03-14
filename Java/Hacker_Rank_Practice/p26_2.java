import java.util.Scanner;

public class p26_2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = (b + c + d) - a;
        System.out.println(e);
    }
}
