import java.util.HashMap;

public class First_Duplicate_Value {
    public int firstDuplicateValue(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int curr = array[i];
            if (map.containsKey(curr)) {
                return curr;
            } else {
                map.put(curr, 1);
            }
        }
        return -1;
    }

     public int firstDuplicateValue1(int[] array) { // <-- topper or wot
        for (int i = 0; i < array.length; i++) {
            int curr = Math.abs(array[i]) - 1;
            if (array[curr] < 0) {
                return Math.abs(array[i]);
            }
            array[curr] = array[curr] * -1;
        }
        return -1;
    }
}
