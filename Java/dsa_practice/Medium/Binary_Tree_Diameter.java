public class Binary_Tree_Diameter {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
        this.value = value;
        }
    }

    public int diameter = 0;
    public int binaryTreeDiameter(BinaryTree tree) {
        helper(tree);
        return diameter;
    }

    public int helper(BinaryTree tree){
        if (tree == null) return 0;
        int left = helper(tree.left);
        int right = helper(tree.right);
        diameter = Math.max(diameter, (left + right));
        return Math.max(left, right) + 1;
    }
}
