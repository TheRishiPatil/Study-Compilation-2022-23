package recursion;

public class keypad_combo {
    public static void main(String[] args) {
        String str = "254";
        keypadCombo(str, 0, "");
    }

    public static String[] combo = {".", "abc" , "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void keypadCombo(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = combo[currChar - '0'];    
        for (int i = 0; i < mapping.length(); i++) {
            keypadCombo(str, index+1, newString + mapping.charAt(i));
        }
    }
}
