package Exercise;
import java.util.*;

public class exercise26 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        pattern(n);
    }

    public static void pattern(int n)
    {
    for (int i = 0; i < n; i++) {
             
        for (int j = 0; j < n; j++) {
        
            if (i == 0 || j == 0 || i == j
                || i == n - 1 || j == n - 1
                || i + j == n - 1)
                    System.out.print("*");
            else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
