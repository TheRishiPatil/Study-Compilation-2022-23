public class Validate_BST {
    public static boolean validateBst(BST tree) {
      return isValid(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isValid(BST tree, int min, int max){
        if (tree == null) return true;
        if (min > tree.value || max <= tree.value) return false;
      
        return isValid(tree.left, min, tree.value) && isValid(tree.right, tree.value, max);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
        this.value = value;
        }
    }
}
