package DSA_Topics;

public class CircularQueueinArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static Boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static Boolean isFull(){
            return (rear + 1) % size == front;
        }

        // O (1)
        public static void add(int data){
            if(isFull()){
                System.out.println("List is full");
                return;
            }

            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // O (1)
        public static int remove(){
            if (isEmpty()) {
                System.out.println("List is Empty");
                return -1;
            }

            int result = arr[front];

            if (rear == front) {
                rear = front = -1;
            } else{
                front = (front + 1) % size;
            }
            return result;
        }

        // O (1)
        public static int peek(){
            if (isEmpty()) {
                System.out.println("List is Empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue list = new Queue(5);
        for (int i = 0; i < list.size; i++) {
            list.add(i + 2);
        }

        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.remove();
        }
    }
}
