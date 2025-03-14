package revision;
// find and delete nth node from end
import java.util.Scanner;


public class LLQ1 {
    Node head;
    private int size;
    LLQ1(){
        this.size = 0;
    } 
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;    
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public Node delete(Node data, int n) {
        if (head.next == null) {
            System.out.println("Blank List!!");
            return null;
        }

        if (n == size) {
            return head.next;
        }

        int index = size - n;
        Node curr = head;
        int i = 1;
        while (i < index) {
            curr = curr.next;
            i++;
        }

        curr.next = curr.next.next;
        return head;
    }

    public void printList() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LLQ1 list = new LLQ1();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        list.delete(list.head, n);

        list.printList();
    }
}