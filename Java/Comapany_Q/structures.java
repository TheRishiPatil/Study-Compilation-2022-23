package Comapany_Q;

import java.util.ArrayList;

public class structures {
    public static void main(String[] args) {
        String str = "Rish ikesh";
        System.out.println(str.substring(2, 9)); // --> shikesh

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
                System.out.print(str.charAt(i) + " ");
                }
            }
        } // -->  i s h 
        
        String word[] = str.split("[ ,!?.]+");
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i] + " ");
        } // --> Rish ikesh

        ArrayList<Integer> table = new ArrayList<>();
        table.add(5);
        System.out.println(table); // --> [5]
    }
}
