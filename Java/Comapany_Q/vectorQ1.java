package Comapany_Q;

import java.util.Scanner;

// delete Character which is just before B

public class vectorQ1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.next();
        System.out.print(solution(str));
    }

    public static String solution(String str) {
        String newStr = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i + 1) == 'B' || str.charAt(i) == 'B') {
                continue;
            }
            else{
                newStr += str.charAt(i);
            }
        }
        if (str.charAt(str.length()- 1) != 'B') {
            newStr += str.charAt(str.length()- 1);
        }
        return newStr;
    }
}
