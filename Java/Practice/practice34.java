package Practice_op;

import java.util.Scanner;

public class practice34 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        String[] a = new String[n];
        int i = 0;
        while (i < n) {
           a[i] = sc.nextLine();
           if (sc.hasNextLine()) {
            i++;
           } 
        }
        for (int j = 0; j < n; j++) {
            System.out.print(a[j]);
            System.out.println();
        }
    }
}
