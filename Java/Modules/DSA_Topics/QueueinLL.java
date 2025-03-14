package topics;

public class QueueinLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static Boolean isEmpty(){
            return tail == null && head == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("List is Empty");
                return -1;
            }

            int result = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("List is Empty");
                return -1;
            }
            return head.data;
        }
    }
    
    public static void main(String[] args) {
        Queue list = new Queue();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.remove();
        }
    }
}
