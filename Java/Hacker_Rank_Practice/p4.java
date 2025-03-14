import java.util.Scanner;

public class p4 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), count = 0;
        if (a < x) {
            c = (a + c) - x;
            if (c <  0) {
            }
            count++;
        }
        if (b < y) {
            c = (b + c) - y;
            if (c <  0) {
            }
            count++;
        }
        if (count == 2 || (x == 0 && y == 0 && a == 0 && b == 0 && c == 0)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
