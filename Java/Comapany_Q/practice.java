package Comapany_Q;

import java.util.Scanner;

public class practice {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int q = sc.nextInt();
        int[] x = new int[q];
        int[] y = new int[q];
        for (int i = 0; i < q; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int i = 0;
        do {
            // if(y[i] > a[m]){ System.out.println("ERROR"); }
            System.out.println(a[x[i] - 1][y[i] - 1]);
            i++;
        } while (i < q);
    }
}