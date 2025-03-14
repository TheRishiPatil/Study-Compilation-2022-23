import java.util.*;

public class p26_3 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // int n = sc.nextInt();
        int small = sc.nextInt();
        int large = sc.nextInt();
        // int count = 0;
        int s, l;
        s = small % 3;
        if (s % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        l = large % 7;
        if (l % 7 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
