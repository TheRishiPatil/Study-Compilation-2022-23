package topics;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
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

        public static void preOrder(Node root){
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if (root == null) {
                return;
            }

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // public static void postOrder(Node root){
        //     if(root == null){
        //         return;
        //     }

        //     postOrder(root.left);
        //     postOrder(root.right);
        //     System.out.print(root.data + " ");
        // }

        // public static void levelOrder(Node root){
        //     if(root == null){
        //         return;
        //     }
        //     Queue<Node> list = new LinkedList<>();
        //     list.add(root);
        //     list.add(null);

        //     while (!list.isEmpty()) {
        //         Node curr = list.remove();
        //         if (curr == null) {
        //             System.out.println();
        //             if (list.isEmpty()) {
        //                 break;
        //             } else{
        //                 list.add(null);
        //             }
        //         } else {
        //             System.out.print(curr.data + " ");
        //             if(curr.left != null){
        //                 list.add(curr.left);
        //             }
        //             if (curr.right != null) {
        //                 list.add(curr.right);
        //             }
        //         }
        //     }
        // }

        // public static int countOfTree(Node root){
        //     if (root == null) {
        //         return 0;
        //     }

        //     int left = countOfTree(root.left);
        //     int right = countOfTree(root.right);

        //     return left + right + 1;
        // }

        public static int sumOfTree(Node root){
            if (root == null) {
                return 0;
            }

            int left = sumOfTree(root.left);
            int right = sumOfTree(root.right);

            return left + right + root.data;
        }
        
        // public static int heightOfTree(Node root){
        //     if (root ==  null) {
        //         return 0;
        //     }

        //     int left = heightOfTree(root.left);
        //     int right = heightOfTree(root.right);
        //     return Math.max(left, right) +1;
        // }

        // public static int diameterOfTree(Node root){ // approach 1
        //     if (root == null) {
        //         return 0;
        //     }

        //     int dia1 = diameterOfTree(root.left);
        //     int dia2 = diameterOfTree(root.right);
        //     int dia3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        //     return Math.max(dia1, Math.max(dia2, dia3));
        // }

        public static void main(String[] args) {
            int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

            Binarytree tree = new Binarytree();
            Node root = tree.buildTree(nodes);
            // System.out.println("Root --> " + root.data);

            // System.out.println("Pre-order --> ");
            preOrder(root);
            System.out.println();

            // System.out.println("In-order --> ");
            // inOrder(root);
            // System.out.println();

            // System.out.println("Post-order --> ");
            // postOrder(root);
            // System.out.println();

            // System.out.println("Level-order --> ");
            // levelOrder(root);

            // System.out.println(countOfTree(root));

            System.out.println(sumOfTree(root));

            // System.out.println(heightOfTree(root));

            // System.out.println(diameterOfTree(root));
        } 
    }       
}
