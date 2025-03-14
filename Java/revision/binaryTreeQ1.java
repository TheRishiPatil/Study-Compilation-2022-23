package revision;

public class binaryTreeQ1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
        static class Binarytree{
            static int idx = -1;
            public static Node buildTree(int[] nodes){
                idx++;
                if(nodes[idx] == -1){
                    return null;
                }

                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);

                return newNode;
            }
        }

        public static boolean isIdentical(Node root, Node subRoot){
            if (root == null && subRoot == null) {
                return true;
            }
    
            if (root == null || subRoot == null) {
                return false;
            }
    
            if (root.data == subRoot.data) {
                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            }
    
            return false;
        }
    
        public static boolean isSubtree(Node root, Node subRoot){
            if (subRoot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    
        public static void main(String[] args) {
            int[] node1 = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

            int[] node2 = {2, 4, -1, -1, 5, -1, -1};
    
            Binarytree tree = new Binarytree();
            Node root = tree.buildTree(node1);

            Binarytree tree2 = new Binarytree();
            Node subRoot = tree2.buildTree(node2);
            
            System.out.println(isSubtree(root, subRoot));
        }
    }   
}
