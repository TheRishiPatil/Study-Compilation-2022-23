package Practice_op;

import java.util.Arrays;

public class practice24 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6, 7};
        int[] b = {2, 4, 8, 7, 10, 11};
        int[] c = new int[a.length * 2];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        int j = 0;
        for (int i = a.length; i < c.length; i++, j++) {
            c[i] = b[j];
        }
        Arrays.sort(c);
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i+1]) {
            } else{
                System.out.print(c[i] + " ");
            }
        }
        if (c[c.length - 1] != c[c.length - 2]) {
            System.out.print(c[c.length - 1]);
        }
    }
}
