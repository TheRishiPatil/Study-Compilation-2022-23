package DSA_Topics;

public class BST{

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        else  {
            root.right = insert(root.right, val);
        }
        return root;
    }
    
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }    
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean searchInBST(Node root, int key){
        if (root == null) {
            return false;
        }

        if (key > root.data) {
            return searchInBST(root.right, key);
        }  else if (root.data == key) {
            return true;
        } else {
            return searchInBST(root.left, key);
        }
    }

    public static Node delete(Node root, int val){
        if (root.data > val) {
            root.left = delete(root.left, val);
        }
        if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else{
            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // case 3 --> Inorder Successor
            Node IS = iS(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node iS(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        delete(root, 5);
        inOrder(root);
        
    }
}