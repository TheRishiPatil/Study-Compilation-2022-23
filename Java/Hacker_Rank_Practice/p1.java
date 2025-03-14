import java.util.*;

public class p1 {
    private static Scanner sc = new Scanner(System.in);
  
    public static void main(String args[] ) throws Exception {
        System.out.print("Number of Cookies You have ");
        int x = sc.nextInt(); // cookies
        System.out.print("Number of Siblings You have ");
        int y = sc.nextInt(); // siblings
        int mi = x/y;
        int remaining = x % y;

        for (int i = 0; i < y; i++) {
            if (remaining == 0) {
                System.out.print(mi + " ");
            }
            else{
                System.out.print((mi + 1) + " ");
                remaining--;
            } 
            // The maximum one should differ from the minimum one by the smallest possible value.
        }
 }
}
