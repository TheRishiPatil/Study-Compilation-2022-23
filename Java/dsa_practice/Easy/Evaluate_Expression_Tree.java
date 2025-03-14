import java.util.*;

public class Evaluate_Expression_Tree {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
    
        public BinaryTree(int value) {
          this.value = value;
        }
      }
    
      public int evaluateExpressionTree(BinaryTree tree) {
        return calculateExpression(tree);
    }

    public static int calculateExpression(BinaryTree tree) {
        if (tree == null) {
            return 0;
        }
        if (tree.value == -1) {
            return calculateExpression(tree.left) + calculateExpression(tree.right);
        } else if (tree.value == -2) {
            return calculateExpression(tree.left) - calculateExpression(tree.right);
        } else if (tree.value == -3) {
            return calculateExpression(tree.left) / calculateExpression(tree.right);
        } else if (tree.value == -4) {
            return calculateExpression(tree.left) * calculateExpression(tree.right);
        }
        return tree.value;
    }
}
