package recursion;

import java.util.Scanner;

public class count_the_path {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(countThePath(0,0));
        System.out.println(countThePath(0, 0, 3, 3));
    }

    static int count = 0;
    public static int countThePath(int n, int m) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            a++;
        }
        for (int i = 0; i < m; i++) {
            b++;
        }
        return a+b;
    }

    public static int countThePath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n-1 && j == m-1) {
            return 1;
        }

        int dowpath = countThePath(i+1, j, n, m);
        int rightpath = countThePath(i, j+1, n, m);
        return dowpath + rightpath;
        
    }
}
