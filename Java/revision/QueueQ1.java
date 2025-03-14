package revision;

import java.util.Stack;
// 1 fake queue using 2 stacks
// by using 2 stacks we simulate 1 fake queue
// stacks return last in first out
// queue return first in first out 

public class QueueQ1 {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static Boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if(isEmpty()){
                return -1;
            }

            return s1.pop();
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String[] args){
        Queue list = new Queue();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        while(!list.isEmpty()){
            System.out.println(list.peek());
            list.remove();
        }
    }
}
