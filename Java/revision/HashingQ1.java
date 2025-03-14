package revision;

import java.util.HashMap;

// find majority element
public class HashingQ1 {
    public static void main(String arg[]) {
        int[] arr = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.containsKey(arr[i])) {
                list.put(arr[i], list.get(arr[i]) + 1);
            } else {
                list.put(arr[i], 1);
            }
        }
        for (int key : list.keySet()) {
            if (list.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
}