import java.util.ArrayList;

public class Max_Min_Stack_Construction {
   
    static class MinMaxStack {
        private ArrayList<Integer> stack = new ArrayList<>();
        private static ArrayList<Integer> min = new ArrayList<>();
        private static ArrayList<Integer> max = new ArrayList<>();

        public int peek() {
            return stack.get(stack.size() - 1);
        }

        public int pop() {
            if (max.get(max.size() - 1) == peek()) {
                max.remove(max.size() - 1);
            }
            if (min.get(min.size() - 1) == peek()) {
                min.remove(min.size() - 1);
            }
            return stack.remove(stack.size() - 1);
        }

        public void push(Integer number) {
            if (stack.isEmpty()) {
                min.add(number);
                max.add(number);
            } else {
                if (number >= max.get(max.size() - 1)) {
                    max.add(number);
                }
                if (number <= min.get(min.size() - 1)) {
                    min.add(number);
                }
            }
            stack.add(number);
        }

        public int getMin() {
            return min.get(min.size() - 1);
        }

        public int getMax() {
            return max.get(max.size() - 1);
        }
    }
}