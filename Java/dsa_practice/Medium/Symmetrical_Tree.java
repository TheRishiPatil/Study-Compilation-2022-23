import topics.BinaryTree;

public class Symmetrical_Tree {

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
        this.value = value;
        }
    }
    public boolean symmetricalTree(BinaryTree tree) {
        return isSymmetric(tree.left, tree.right);
    }

    public static boolean isSymmetric(BinaryTree tree1, BinaryTree tree2){
        if (tree1 == null && null == tree2) return true;
        if (tree1 != null && null == tree2) return false;
        if (tree1 == null && null != tree2) return false;
        if (tree1.value != tree2.value) return false;
        return isSymmetric(tree1.left, tree2.right) && isSymmetric(tree1.right, tree2.left);
    }
}
