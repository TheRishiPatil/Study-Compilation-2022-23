package revision;

import java.util.*;

public class StackQ2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Stack<Integer> list = new Stack<>();
        while(sc.hasNextInt()){
            list.push(sc.nextInt());
        }
        reverse(list);
        System.out.println(list);
    }

    public static void bottom(Stack<Integer> list, int n){
        if (list.isEmpty()) {
            list.push(n);
            return;
        }
        int top = list.pop();
        bottom(list, n);
        list.push(top);
    }

    public static void reverse(Stack<Integer> list) {
        if (list.isEmpty()) {
            return;
        }
        int top = list.pop();
        reverse(list);
        bottom(list, top);
    }
}
