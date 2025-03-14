
import java.util.*;

public class Branch_Sums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;
    
        BinaryTree(int value) {
          this.value = value;
          this.left = null;
          this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        ArrayList<Integer> sums = new ArrayList<>();
        calculateSums(root, 0, sums);
        return sums;
    }

    public static void calculateSums(BinaryTree root, int sum, ArrayList<Integer> sums) {
        if (root == null) {
            return;
        }
        int newSum = sum + root.value;
        if (root.left == null && root.right == null) {
            sums.add(newSum);
            return;
        }
        calculateSums(root.left, newSum, sums);
        calculateSums(root.right, newSum, sums);
    }
}
