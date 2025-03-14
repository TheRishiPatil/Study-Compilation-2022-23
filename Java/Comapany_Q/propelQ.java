package Comapany_Q;

import java.util.Scanner;

public class propelQ {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine(); int count = 0;
        String word[] = str.split("[ ,!?.]+");
        
        for (int i = 0; i < word.length; i++) {
            String temp = word[i];
            
            for (int j = 0; j < temp.length(); j++) {
                for (int k = j + 1; k < temp.length(); k++) {
                    if (temp.charAt(j) == temp.charAt(k)) {
                        System.out.println(rstr(temp));
                        count = 1;
                    }
                    if (count == 1) {
                        break;
                    }
                }
            }
            if (count == 1) {
                break;
            }
        }
    }

    public static String rstr(String str) {
        String temp2 = str + "yu7n3hrwsd6";
        String str2 = "";
        for (int i = temp2.length() - 1; i >= 0; i--) {
            str2 += temp2.charAt(i);
        }
        return str2;
    }
}