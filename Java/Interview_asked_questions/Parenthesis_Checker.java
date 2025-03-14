import java.util.*;

public class Parenthesis_Checker {
    public static void main(String[] args) {
        String str = "({[]})";
        boolean ans = true;
        Stack<Character> list = new Stack<>();
        for (char i : str.toCharArray()) {
            if (i == '(' || i == '[' || i == '{') {
                list.add(i);
            } else {
                if (!list.isEmpty() && ((i == '}' && list.peek() == '{') || (i == ']' && list.peek() == '[')
                        || (i == ')' && list.peek() == '('))) {
                    list.pop();
                } else {
                    ans = false;
                    break;
                }
            }
        }
        if (!list.isEmpty()) {
            ans = false;
        }
        System.out.println(ans);
    }
}
