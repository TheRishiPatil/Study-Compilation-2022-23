package revision;

import java.util.ArrayList;

public class BSTQ2 {
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

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void printList(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " --> ");
        }
        System.out.println();
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> List){
        if (root == null) {
            return;
        }
        List.add(root.data);
        // leaf
        if (root.left == null && root.right == null) {
            printList(List);
        } else{ // non-leaf
            printRootToLeaf(root.left, List);
            printRootToLeaf(root.right, List);
        }
        List.remove(List.size() - 1);
    }

    public static void main(String args[]){
        int[] values = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        printRootToLeaf(root, new ArrayList<>());
    }
}
