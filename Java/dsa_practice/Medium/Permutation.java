package recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        permuTation(str, "");
    }

    static int count = 0;

    public static void permuTation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            count++;
            System.out.println(count);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permuTation(newStr, permutation + currChar);
        }
    }
}