import java.util.HashMap;
import java.util.Map;

public class First_Non_Repeating_Char {
    public int firstNonRepeatingCharacter(String string) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : string.toCharArray()) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        Character find = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                find = entry.getKey();
                break;
            }
        }
        if (find != null) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == find) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
