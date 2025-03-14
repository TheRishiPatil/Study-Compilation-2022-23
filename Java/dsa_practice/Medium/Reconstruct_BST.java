import java.util.*;

public class Reconstruct_BST {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
        this.value = value;
        }
    }

    // public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) { // <-- O (n2)
    //     BST tree = new BST(preOrderTraversalValues.get(0));
    //     for (int i = 1; i < preOrderTraversalValues.size(); i++) {
    //         insert(tree, preOrderTraversalValues.get(i));
    //     }
    //     return tree;
    // }

    // public static BST insert(BST tree, int value){
    //     if (tree == null) return new BST(value);
    //     if (tree.value <= value) tree.right = insert(tree.right, value); 
    //     else  tree.left = insert(tree.left, value);
    //     return tree;
    // }

    static class track{ // samaj nhi aaya ye kyu liya pr thike, Who cares..
        public int count;

        track(int count) { 
            this.count = count; 
        }
    }

    public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
        track latest = new track(0);
        return create(latest, preOrderTraversalValues, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static BST create(track latest, ArrayList<Integer> array, int min, int max){
        if(latest.count == array.size()) return null;
        BST tree = new BST(array.get(latest.count));
        if(tree.value < min || tree.value >= max) return null;
        latest.count++;
        tree.left = create(latest, array, min, tree.value);
        tree.right = create(latest, array, tree.value, max);
        return tree;
    }
}
