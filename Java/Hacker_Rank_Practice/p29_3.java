import java.util.Scanner;

public class p29_3 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int temp1 = 0, temp2 = 0;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (temp1 >= temp2) {
                temp2 += b[i];
            } if (temp1 < temp2) {
                temp1 += b[i];
            }         
        }
        if (temp1 == temp2) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
