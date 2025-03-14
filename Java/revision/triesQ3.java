package revision;

import Practice_op.starQuestions;

public class triesQ3 {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();
    public static String ans = "";

    public static void insert(String key){
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            if (i == key.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    public static void isAllPrefixs(Node root, StringBuilder str){
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                str.append((char) (i + 'a'));
                if (str.length() > ans.length()) {
                    ans = str.toString();
                }
                isAllPrefixs(root.children[i], str);
                str.deleteCharAt(str.length() - 1);
            }
        }
    }

    public static void main(String arg[]){
        String words[] = {"a", "banana", "ap", "app", "appl", "apply", "apple"};
        for (String word : words) {
            insert(word);
        }
        isAllPrefixs(root, new StringBuilder(""));
        System.out.println(ans);
    }
}