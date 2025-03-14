package topics;

public class Trie {

    static class Node {
        Node[] children;
        boolean eow; // end of word

        public Node() {
            children = new Node[26];

            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }

            eow = false;

        }
    }

    static Node root = new Node();

    public static void insert(String word) { // O(L)
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) { // add new node
                curr.children[idx] =  new Node();
            }

            if (i == word.length() - 1) { // end of word
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx]; // next new node

        }
    }

    public static boolean search(String word){ // O(L)
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            if (curr.children[idx].eow == false && i == word.length() -  1) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static boolean wordBreak(String key){
        if (key.length() == 0) {
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            String s1 = key.substring(0, i);
            String s2 = key.substring(i);

            if (search(s1) && wordBreak(s2)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] words = { "i", "like", "sam", "samsung", "any"};
        String key = "ilikesamsung";

        for (String word : words) {
            insert(word);
        }

        System.out.println(wordBreak(key));

    }
}
