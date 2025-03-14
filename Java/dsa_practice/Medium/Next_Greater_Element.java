import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element {
    public int[] nextGreaterElement(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[array.length];

        Arrays.fill(ans, -1);

        for (int i = 0; i < ans.length * 2; i++) {
            int idx = i % ans.length;
            while (!stack.isEmpty() && array[idx] > array[stack.peek()]) {
                ans[stack.pop()] = array[idx];
            }
            stack.push(idx);
        }

        return ans;
    }
}
