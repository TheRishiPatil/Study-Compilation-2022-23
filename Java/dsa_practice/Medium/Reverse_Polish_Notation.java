import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Reverse_Polish_Notation {
    public static int reversePolishNotation(String[] tokens) {
        Stack<Integer> operation = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == "+" || tokens[i] == "-" || tokens[i] == "*" || tokens[i] == "/") {
                int val2 = operation.pop();           
                int val1 = operation.pop();
                if (tokens[i] == "+") {
                    operation.push(val1 + val2);
                } else if (tokens[i] == "-") {
                    operation.push(val1 - val2);
                } else if (tokens[i] == "*") {
                    operation.push(val1 * val2);
                } else if (tokens[i] == "/") {
                    operation.push(val1 / val2);
                }
            }
            else {
                operation.push(Integer.parseInt(tokens[i]));
            }
        }
        return operation.peek();
    }

    public static int reversePolishNotation1(String[] tokens) { // chatgpt --> sometimes == sign wont work compiler throws exception
        Stack<Integer> operation = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int val2 = operation.pop();
                int val1 = operation.pop();
                if (tokens[i].equals("+")) {
                    operation.push(val1 + val2);
                } else if (tokens[i].equals("-")) {
                    operation.push(val1 - val2);
                } else if (tokens[i].equals("*")) {
                    operation.push(val1 * val2);
                } else if (tokens[i].equals("/")) {
                    operation.push(val1 / val2);
                }
            } else {
                try {
                    operation.push(Integer.parseInt(tokens[i]));
                } catch (NumberFormatException e) { }
            }
        }
        return operation.peek();
    }
    

    public static void main(String[] args) {
        String[] a = {"10", "5", "+"};
        System.out.println(reversePolishNotation(a));
    }
}
