package topics;

public class StackinLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head;
        public static Boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if (head == null) {
                return -1;
            }

            int top = head.data;
            head = head.next;

            return top;
        }

        public static int peek(){
            if (head == null) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack list = new Stack();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);

        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.pop();
        }
    }
    
}
