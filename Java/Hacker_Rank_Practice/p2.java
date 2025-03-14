import java.util.*;

public class p2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) throws Exception {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x / y;
        int rem = x % y;
        int a[] = new int[y];
        for (int i = 0; i < y; i++)
            a[i] = z;
        for (int i = 0; i < rem; i++) {
            a[i] += 1;
        }
        for (int i = 0; i < y; i++)
            System.out.print(a[i] + " ");
    }
}