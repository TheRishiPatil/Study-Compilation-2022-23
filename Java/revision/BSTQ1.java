package revision;

public class BSTQ1 {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node BuildTree(Node root, int val){
        if (root ==  null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = BuildTree(root.left, val);
        }
        else {
            root.right = BuildTree(root.right, val);
        }
        return root;
    }

    public static void printInRange(Node root, int x, int y){
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } else if (root.data >= y) {
            printInRange(root.left, x, y);
        } else{
            printInRange(root.right, x, y);
        }
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = BuildTree(root, values[i]);
        }

        printInRange(root, 6, 10);
    }
}
