package topics;

import javax.print.attribute.standard.Sides;

public class QueueinArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
 
        public static Boolean isEmpty(){
            return rear == -1;
        }

        // O (1)
        public static void add(int data){
            if (size -1 == rear) {
                System.out.println("List is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // O (n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("List is Empty");
                return -1;
            }

            int front = arr[0];
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        // O (n)
        public static int peek(){
            if(isEmpty()){
                System.out.println("List is Empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        // Queue<Integer> list = new LinkedList<>();
        // Queue<Integer> list = new ArrayDeque<>();
        Queue list = new Queue(5);
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
