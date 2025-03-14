import java.util.Scanner;

public class p26_1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(); // no. of limes
        int a = sc.nextInt(); // max size of limes
        int d = sc.nextInt(); // when the waste section should be emptied.
        int[] b = new int[n];
        int c = 0, e = 0;
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            c += b[i];
            if (b[i] > a) {
                System.out.println("0");
            } else{
                do {
                    e = c - d;
                } while (d == 0);
            }
        }
        if (e != 0) {
         System.out.println(e);
        }
    }
}