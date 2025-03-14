import java.util.HashMap;
import java.util.Map;

public class Suffix_Trie_Construction {

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    }

    static class SuffixTrie {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        public void populateSuffixTrieFrom(String str) {
            for (int i = 0; i < str.length(); i++) {
                String word = str.substring(i);
                TrieNode curr = root;
                for (char ch : word.toCharArray()) {
                    if (!curr.children.containsKey(ch)) {
                        curr.children.put(ch, new TrieNode());
                    }
                    curr = curr.children.get(ch);
                }
                curr.children.put(endSymbol, null);
            }
        }

        public boolean contains(String str) {
            TrieNode curr = root;
            for (char ch : str.toCharArray()) {
                if (!curr.children.containsKey(ch)) {
                    return false;
                }
                curr = curr.children.get(ch);
            }
            return curr.children.containsKey(endSymbol);
        }
    }
}
