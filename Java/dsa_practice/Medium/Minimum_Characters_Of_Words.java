import java.util.HashMap;

public class Minimum_Characters_Of_Words {
    public static char[] minimumCharactersForWords(String[] words) {
        StringBuilder chars = new StringBuilder();
        HashMap<Character, Integer> list = new HashMap<>();

        for (String word : words) {
            HashMap<Character, Integer> temp = new HashMap<>();
            for (Character ch : word.toCharArray()) {
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
                if (!list.containsKey(ch)) {
                    list.put(ch, list.getOrDefault(ch, 0) + 1);
                    chars.append(ch);
                } else if (temp.get(ch) > list.get(ch)) {
                    list.put(ch, list.get(ch) + 1);
                    chars.append(ch);
                }
            }
        }

        return chars.toString().toCharArray();
    }

    public static void main(String[] args) {
        String[] words = {"this", "that", "did", "deed", "them!", "a"};
        char[] ch = minimumCharactersForWords(words);

        for (char c : ch) {
            System.out.print(c + " ");
        }
    }
}
