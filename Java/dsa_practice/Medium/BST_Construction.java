public class BST_Construction{
    static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

        public BST insert(int value) {
            insertHelper(this, value);
            return this;
        }

        public BST insertHelper(BST tree, int value){
            if (tree == null) {
                return new BST(value);
            }
            if (value >= tree.value) {
                tree.right = insertHelper(tree.right, value);
            } else {
                tree.left = insertHelper(tree.left, value);
            }
            return tree;
        }

        public boolean contains(int value) {
            return containsHelper(value, this);
        }

        public boolean containsHelper(int value, BST tree){
            if (tree == null) {
                return false;
            }
            if (value == tree.value) {
                return true;
            }
            if (value < tree.value) {
                return containsHelper(value, tree.left);
            } else {
                return containsHelper(value, tree.right);
            }
        }

        public BST remove(int value) {
            removeHelper(value, this);
            return this;
        }

        public BST removeHelper(int value, BST tree){
            if (tree == null) {
                return tree;
            }
            if (tree.value > value) {
               tree.left = removeHelper(value, tree.left);
            } else if (tree.value < value) {
                tree.right = removeHelper(value, tree.right);
            }
            else{
                // case 1
                if (tree.left == null && tree.right == null) {
                    return null;
                }

                // case 2
                if (tree.left == null && tree.right != null) {
                    tree.value = tree.right.value;
                    tree.left = tree.right.left;
                    tree.right = tree.right.right;
                    return tree;
                }
                if (tree.right == null && tree.left != null) {
                    tree.value = tree.left.value;
                    tree.right = tree.left.right;
                    tree.left = tree.left.left;
                    return tree;
                }

                // case 3
                if (tree.left != null && tree.right != null) {
                    int smallest = smallestValue(tree.right);
                    tree.value = smallest;
                    tree.right = removeHelper(smallest, tree.right);
                    return tree;
                }
            }
            return tree;
        }

        public int smallestValue(BST tree){
            return tree.left == null ? tree.value : smallestValue(tree.left);
        }
    }
}