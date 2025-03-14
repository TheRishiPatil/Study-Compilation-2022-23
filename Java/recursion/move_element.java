package recursion;

import java.util.Scanner;

public class move_element {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.next();
        char c = sc.next().charAt(0);
        moveTheElement(str, 0, 0, "", c);

    }

    public static void moveTheElement(String str, int index, int count, String newstr,char character) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newstr += character;
            }
            System.out.println(newstr);
            return;
        }
        if (str.charAt(index) == character) {
            count++;
        } else{
            newstr += str.charAt(index);
        }
        moveTheElement(str, index + 1, count, newstr,character);
    }
}