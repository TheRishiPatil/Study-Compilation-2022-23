import java.util.*;

public class Node_Depths_Sums {
    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;
    
        public BinaryTree(int value) {
          this.value = value;
          left = null;
          right = null;
        }
    }

    public static int nodeDepths(BinaryTree root) {
        return calculateDepthSums(root, 0);
    }

    public static int calculateDepthSums(BinaryTree root, int depth){
        if (root == null) {
            return 0;
        }
        int sum = depth;
        int left = calculateDepthSums(root.left, depth + 1);
        int right = calculateDepthSums(root.right, depth + 1);
        return sum + left + right;
    }
}
