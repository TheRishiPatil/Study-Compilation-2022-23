import java.util.Arrays;
import java.util.Scanner;

public class p33_2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = m*2, temp1 = 0, temp2 = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < m; i++) {
            temp1 += a[i];
        }
        for (int i = m; i < n; i++) {
            temp2 += a[i];
        }   
        if (temp1 != temp2) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        } else{
            System.out.println("-1");    
        }
    }
}
