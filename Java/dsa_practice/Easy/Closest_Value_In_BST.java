

public class Closest_Value_In_BST{
    static class BST {
        public int value;
        public BST left;
        public BST right;
    
        public BST(int value) {
          this.value = value;
        }
    }

    public static BST insert(BST tree, int value){
        if (tree == null) {
            tree = new BST(value);
            return tree;
        }
        if (tree.value > value) {
            tree.left = insert(tree.left, value);
        } else{
            tree.right = insert(tree.right, value);
        }
        return tree;
    }

    public static int closestValue(BST tree, int target, int closest){
        if (tree == null) {
            return closest;
        }
        if (Math.abs(closest - target) > Math.abs(tree.value - target)) {
            closest = tree.value;
        }
        if (target > tree.value) {
            return closestValue(tree.right, target, closest);
        } else if (target < tree.value) {
            return closestValue(tree.left, target, closest);
        }
        return closest;
           
    }

    public static int findClosestValueInBst(BST tree, int target) {
        return closestValue(tree, target, Integer.MAX_VALUE);
    }

    
    public static void main(String[] args) {
        int value[] = {10, 5, 2, 1, 5, 15, 13, 14, 22};
        BST tree = null;

        for (int i = 0; i < value.length; i++) {
            tree = insert(tree, value[i]);
        }

        System.out.println(findClosestValueInBst(tree, 6));
    }
}