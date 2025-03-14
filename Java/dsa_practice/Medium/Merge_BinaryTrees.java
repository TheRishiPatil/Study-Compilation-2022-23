public class Merge_BinaryTrees {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
        this.value = value;
        }
    }

    public BinaryTree mergeBinaryTrees(BinaryTree tree1, BinaryTree tree2) {
        if (tree1 == null && tree2 == null) return null;
        if (tree1 == null && tree2 != null) return tree2;
        if (tree1 != null && tree2 == null) return tree1;
        else tree1.value = tree1.value + tree2.value;

        tree1.left = mergeBinaryTrees(tree1.left, tree2.left);
        tree1.right = mergeBinaryTrees(tree1.right, tree2.right);
        return tree1;
    }
}
