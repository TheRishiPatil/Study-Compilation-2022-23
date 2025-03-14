package revision;

import java.util.Stack;
import java.util.Scanner;

public class StackQ1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Stack<Integer> list = new Stack<>();
        int n = sc.nextInt();
        while(sc.hasNextInt()){
            list.push(sc.nextInt());
        }
        bottom(list, n);

        System.out.println(list);
        
    }

    public static void bottom(Stack<Integer> a, int n){
        if (a.isEmpty()) {
            a.push(n);
            return;
        }
        int top = a.pop();
        bottom(a, n);
        a.push(top);
    }
}
