package topics;
import java.util.*;

class stackinAL {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static Boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {

        // Stack<Integer> list = new Stack<>():  <-- stack in collection framework

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
