package Comapany_Q;

import java.util.Scanner;

public class tp {

    public static Scanner sc = new Scanner(System.in);

    static void getnumber(String str, int num){
        int count[] = new int[256];
        for (int i = 0; i < num; i++) 
        count[str.charAt(i)]++;

        char ch[] = new char[num];
        for (int i = 0; i < num; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == ch[j]) {
                    find++;
                }
            }
            if (find == 1) 
                System.out.println(count[str.charAt(i)]);
            
        }
        
    }
    

    public static void main(String[] args) {
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        getnumber(a, n);
        getnumber(b, n);
    }

}
