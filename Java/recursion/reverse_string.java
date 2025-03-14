package recursion;

import java.util.Scanner;

public class reverse_string {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.next();
        reverseString(str, str.length() - 1);
    }

    public static void reverseString(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str, index - 1);
    }
}
