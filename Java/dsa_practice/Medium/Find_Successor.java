public class Find_Successor{
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
        this.value = value;
        }
    }

    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
      if (node.right != null) return haveLeft(node.right);

      BinaryTree ans = node.parent;
      while (ans != null && node == ans.right) {
        node = ans;
        ans = ans.parent;
      }
      return ans;
    }
    public BinaryTree haveLeft(BinaryTree tree){
        while (tree.left != null) tree = tree.left;
        return tree;
    }
}