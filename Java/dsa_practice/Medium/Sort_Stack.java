import java.util.ArrayList;

public class Sort_Stack {
    public static ArrayList<Integer> sortStack(ArrayList<Integer> stack) {
        if (stack.size() == 0) {
            return stack;
        }
        int top = stack.remove(stack.size() - 1);
        stack = sortStack(stack);
        insert(stack, top);
        return stack;
    }

    public static void insert(ArrayList<Integer> stack, int top) {
        if (stack.size() == 0) {
            stack.add(top);
            return;
        }

        int currTop = stack.get(stack.size() - 1);
        if (currTop > top) {
            stack.remove(stack.size() - 1);
            insert(stack, top);
            stack.add(currTop);
        } else {
            stack.add(top);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();
        stack.add(34);
        stack.add(3);
        stack.add(31);
        stack.add(98);
        stack.add(92);
        stack.add(23);

        System.out.println("Original Stack: " + stack);
        stack = sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
