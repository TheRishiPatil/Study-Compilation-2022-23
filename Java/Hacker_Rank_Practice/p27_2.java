import java.util.Scanner;

public class p27_2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int p = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt(); 
        int add = 0;
        for (int i = 1; i <= m; i++) {
            add += p * i;
        }
        if (add > x) {
        System.out.println(add - x);
        }
        else{
            System.out.println("0");
        }
    }
}
