package revision;
// is loop?
public class LLQ3 {
    Node head;

    public static class Node{
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


    public Boolean isLoop(){
        if (head == null) {
            return false;
        }

        Node rabbit = head;
        Node turtle = head;

        while (rabbit != null || rabbit.next != null) {
            rabbit = rabbit.next.next;
            turtle = turtle.next;

            if (rabbit == turtle) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        LLQ3 list = new LLQ3();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
        
        System.out.println(list.isLoop());
    }
}
