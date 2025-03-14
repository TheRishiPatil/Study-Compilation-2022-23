package Practice_op;

import java.util.Scanner;

public class practice26 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        int count = 0;
        int length = a.length();
        for (int i = 0; i < a.length(); i++) {
            if(b.charAt(i) > a.charAt(i)){
                count = i;
            } 
        }
        if (length <= 2) {
            System.out.println(count);
        } else if (a.equals(b)) {
            System.out.println("0");
        } else{
            System.out.println(count + 1);
        }
    }
}