import java.util.ArrayList;
import java.util.List;

public class Permutation_List {
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (array.size() == 0) {
            return result;
        }
        solution(array, new ArrayList<>(), result);
        return result;
    }

    public static void solution(List<Integer> array, List<Integer> curr, ArrayList<List<Integer>> result) {
        if (array.isEmpty()) {
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < array.size(); i++) {
            int currValue = array.get(i);
            curr.add(currValue);

            List<Integer> remaining = new ArrayList<>(array);
            remaining.remove(i);

            solution(remaining, curr, result);
            curr.remove(curr.size() - 1);
        }
    }

}
