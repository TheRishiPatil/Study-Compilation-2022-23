package recursion;

import java.util.Scanner;

public class remove_duplicate {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        removeDuplicate(str, 0, "");
    }

    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char character = str.charAt(index);
        if (map[character - 'a'] == true) {
            removeDuplicate(str, index + 1, newString);
        }
        else{
            newString += character;
            map[character - 'a'] = true;
            removeDuplicate(str, index + 1, newString);
        }
    }
}
