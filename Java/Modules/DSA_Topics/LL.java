package topics;

public class LL {
    Node head;
    private int size;
    LL(){
        this.size = 0;
    } 
    class Node{
        String data;
        Node nextNode;

        Node(String data){
            this.data = data;
            this.nextNode = null;
            size++;
        }
    }

    // add - first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;    
            return;
        }

        newNode.nextNode = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.nextNode != null) {
            currNode = currNode.nextNode;
        }

        currNode.nextNode = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.nextNode;
        }
        System.out.println("Null");
    }

    // delete - first, last
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;

        head = head.nextNode;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.nextNode == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.nextNode;
        while (last.nextNode != null) {
            last = last.nextNode;
            secondLast = secondLast.nextNode;
        }
        secondLast.nextNode = null;
    }

    public int size() {
        return size;
    }

    // reverse
    public void reverseLL() {
        if (head == null || head.nextNode == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.nextNode;

        while (currNode != null) {
            Node nexNode = currNode.nextNode;
            currNode.nextNode = prevNode;

            // update
            prevNode = currNode;
            currNode = nexNode;
        }
        head.nextNode = null;
        head = prevNode;
    }

    public Node reverseLLinRecursive(Node head) {
        if (head == null || head.nextNode == null) {
            return head;
        }

        Node newHead = reverseLLinRecursive(head.nextNode);
        head.nextNode.nextNode = head;
        head.nextNode = null;
        return newHead;
    }

    // size
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");

        list.addLast("list");
        list.addFirst("This");
        list.printList();

        System.out.println(list.size());

        list.reverseLL();
        list.printList();

        list.head = list.reverseLLinRecursive(list.head);
        list.printList();
    }
}
