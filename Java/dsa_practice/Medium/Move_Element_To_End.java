import java.util.*;

public class Move_Element_To_End {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        List<Integer> arr = array;
        int start = 0;
        int end = array.size() - 1;
        while (start < end) {
            if (arr.get(start) == toMove) {
                if (arr.get(end) != toMove) {
                    int temp = arr.get(start);
                    arr.set(start, arr.get(end));
                    arr.set(end, temp);
                }
                end--;
            } else {
                start++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(2, 4, 2, 5, 6, 2, 2));
        int target = 2;
        List<Integer> arr = moveElementToEnd(array, target);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
