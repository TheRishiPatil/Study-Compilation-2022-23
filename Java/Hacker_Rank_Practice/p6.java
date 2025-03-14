import java.util.Scanner;

public class p6 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int x = sc.nextInt();
        int count = 0;
        while (x > 0) {
            if (x >= 100) { x -= 100; count++; }
            if (x >= 20 && x < 100) { x -= 20; count++; }
            if (x >= 10 && x < 20) { x -= 10; count++; }
            if (x >= 5 && x < 10) { x -= 5; count++; }
            if (x >= 1 && x < 5) { x -= 1; count++; }
        }
        System.out.println(count);
    }
}