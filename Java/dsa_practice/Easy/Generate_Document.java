import java.util.HashMap;

public class Generate_Document {
    public boolean generateDocument(String characters, String document) { // my solution
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : characters.toCharArray()) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (char i : document.toCharArray()) {
            if (map.containsKey(i) && map.get(i) > 0) {
                map.put(i, map.get(i) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean generateDocument1(String characters, String document) { // solution from chatgpt
    HashMap<Character, Integer> map = new HashMap<>();
    
    for (char c : characters.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1); // <-- This part retrieves the value associated with the key c from the map if it exists. If the key doesn't exist in the map, it returns the default value, which is 0.
    }
    
    for (char c : document.toCharArray()) {
        if (map.containsKey(c) && map.get(c) > 0) {
            map.put(c, map.get(c) - 1);
        } else {
            return false;
        }
    }
    
    return true;
}


    public static void main(String[] args) {
        String str = "Rishi";
        for (char i : str.toCharArray()) {
            System.out.println(i);
        }
    }
}
