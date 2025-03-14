public class Height_Balanced_Binary_Tree {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
        this.value = value;
        }
    }

    public boolean heightBalancedBinaryTree(BinaryTree tree) {
        return counting(tree, 0) >= 0;
    }

    public static int counting(BinaryTree tree, int finalCount){
        if (tree == null) return 0;
        int leftCount = counting(tree.left, finalCount);
        int rightCount = counting(tree.right, finalCount);
        if (leftCount < 0 || rightCount < 0 || Math.abs(leftCount - rightCount) > 1) return -1;
        finalCount = Math.max(leftCount, rightCount);
        return finalCount + 1;        
    }
}
