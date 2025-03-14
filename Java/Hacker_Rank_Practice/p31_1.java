import java.util.Scanner;

public class p31_1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                int mindiff = a[1] - a[0];
                Math.min(mindiff, a[i] - a[j]);
            }
        }
        System.out.println(i + " " + j);
    }
}
