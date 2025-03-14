import java.util.Scanner;

public class p35_2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        if (n2 > n1 || k2 > k1) {
            System.out.println("Second");
        }else {
            System.out.println("First");
        }
    }
} 