package revision;
import java.util.Scanner;
// is pailndrome?
public class LLQ2 {
    Node head;

    public class Node{
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }

        newNode.next = head;
        head = newNode;
    }    

    public void isPalindrome(Node data){
        if (head == null || head.next == null) {
            System.out.println("True");
        }

        Node middle = findMiddle(head);
        Node secondStart = reverse(middle.next);
        Node firstStart = head;

        while (secondStart != null) {
            if (firstStart.data != secondStart.data) {
            System.out.println("False");
            }

            secondStart = secondStart.next;
            firstStart = firstStart.next;
        }
            System.out.println("True");
    }

    
    public Node findMiddle(Node head){
        Node rabbit = head;
        Node turtle = head;
        while (rabbit.next != null && rabbit.next.next != null) {
            rabbit = rabbit.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public Node reverse(Node head){
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLQ2 list = new LLQ2();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(20);
        list.add(10);
        list.isPalindrome(list.head);   
    }
}
