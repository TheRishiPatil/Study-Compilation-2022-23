import java.util.Scanner;

public class practice21 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        String name = sc.next();

        System.out.print("From what you want to reverse String: ");
        int a = sc.nextInt();

        char[] ch = new char[name.length()];
        String temp1 = "", temp2 = "";

        for (int i = 0; i < name.length(); i++) {
            ch[i] = name.charAt(i);
            if (i >= a) {
                temp1 = ch[i] + temp1;
            }
            if (i <= a - 1) {
                temp2 = temp2 + ch[i];
            }
        }

        System.out.println(temp2 + temp1);
    }
}
