package Practice_op;

import java.util.Scanner;

public class practice25 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        String[] a = new String[n];
        int i = 0;
        while (sc.hasNextLine()) {
            a[i] = sc.next();
            i++;
        }
        for (i = n-1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        
    }
}