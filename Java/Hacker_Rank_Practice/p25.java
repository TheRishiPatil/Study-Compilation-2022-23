import java.util.*;

public class p25 {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Ted's Weight: ");
        int a = sc.nextInt();
        System.out.print("Enter the Michael's Weight: ");
        int b = sc.nextInt();
        int count = 0;
        if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {
            do {
                if (a <= b) {
                    a = a * 3;
                    b = b * 2;
                    count++;
                }
            } while (a <= b);
    
            System.out.println(count + " years will Ted need to be strictly larger than Michael.");
        } else {
            System.out.println("Enter weight less than 10!!");
        }
    }
}