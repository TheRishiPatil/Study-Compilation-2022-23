import java.util.Stack;

public class Balanced_Brackets {
    public static boolean balancedBrackets1(String str) {
        int count1 = 0, count2 = 0, count3 = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '{') { count1++; }
            if (ch == '[') { count2++; }
            if (ch == '(') { count3++; }

            if (ch == '}' && count1 > 0) { count1--; }
            else if (ch == ']' && count2 > 0) { count2--; }
            else if (ch == ')' && count3 > 0) { count3--; }
            else if (ch == '}' || ch == ']' || ch == ')') {
                return false;
            }
        }
        if (count1 != 0|| count2 != 0 || count3 != 0) {
            return false;
        }
        return true;
    }

    public static boolean balancedBrackets(String str) { // using stack
        Stack <Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '{') { stack.push('}'); }
            else if (ch == '[') { stack.push(']'); }
            else if (ch == '(') { stack.push(')'); }
            else if (ch == '}' || ch == ')' || ch == ']') {
                if (stack.isEmpty() || ch != stack.pop()) {
                    return false;
                }
            }
        } 
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(()agwg())((()agwga()())gawgwgag)";
        System.out.println(balancedBrackets(str));
    }
}