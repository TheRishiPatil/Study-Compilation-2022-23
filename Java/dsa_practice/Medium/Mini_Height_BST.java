import java.util.*;

public class Mini_Height_BST {
    public static BST minHeightBst(List<Integer> array) {
        if (array.size() == 0) return null;
        int mid = array.size() / 2;
        BST tree = new BST(array.get(mid));
        buildBST(tree, array, 0, mid - 1);
        buildBST(tree, array, mid + 1, array.size() - 1);
        return tree;
    }

    public static void buildBST (BST tree, List<Integer> array, int start, int end){
        if(start > end) return;
        int mid = (end + start) / 2;
        tree.insert(array.get(mid));
        buildBST(tree, array, start, mid - 1);
        buildBST(tree, array, mid  + 1, end);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
        this.value = value;
        left = null;
        right = null;
        }

        public void insert(int value) {
        if (value < this.value) {
            if (left == null) {
            left = new BST(value);
            } else {
            left.insert(value);
            }
        } else {
            if (right == null) {
            right = new BST(value);
            } else {
            right.insert(value);
            }
        }
        }
    }
}
