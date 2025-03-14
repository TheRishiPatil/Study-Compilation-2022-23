import java.util.*;

public class Find_Kth_Largest_Value_In_BST {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
        this.value = value;
        }
    }

    public int findKthLargestValueInBst(BST tree, int k) {
        List<Integer> array = new ArrayList<>();
        findValue(tree, array, k);
        return array.get(k - 1);
    }

    public static void findValue(BST tree, List<Integer> array, int k){
        if (k == 0 || tree == null) return;
        findValue(tree.right, array, k--);
        array.add(tree.value);
        findValue(tree.left, array, k--);
    }
}
