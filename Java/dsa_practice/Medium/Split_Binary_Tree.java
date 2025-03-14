public class Split_Binary_Tree{
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
        this.value = value;
        }
    }

    public boolean is = false;

    public int splitBinaryTree(BinaryTree tree) {
        if ((tree.left == null && tree.right == null) || tree == null) return 0;
        int sum = sumTree(tree) % 2 == 0 ? sumTree(tree) / 2 : 0;
        checkSum(tree, sum);
        return is ? sum : 0; 
    }

    public int checkSum(BinaryTree tree, int sum){
        if (tree == null) return 0;
        int currSum = checkSum(tree.left, sum) + checkSum(tree.right, sum) + tree.value;
        if (currSum == sum) is = true; 
        return currSum;
    }
    
    public int sumTree(BinaryTree tree){
        if (tree == null) return 0;
        return sumTree(tree.left) + sumTree(tree.right) + tree.value;
    }  
}