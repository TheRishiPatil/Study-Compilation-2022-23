import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Powerset {

    public static List<List<Integer>> powerset(List<Integer> array) { // chatgpt
        List<List<Integer>> result = new ArrayList<>();
        int n = array.size();
        int totalSubsets = 1 << n; // Total possible subsets = 2^n

        for (int mask = 0; mask < totalSubsets; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(array.get(i));
                }
            }
            result.add(subset);
        }

        return result;
    }

    public static List<List<Integer>> powerset1(List<Integer> array) { // algoexperts
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int i = 0; i < array.size(); i++) {
            int size = result.size();
            for (int j = 0; j < size; j++) {
                List<Integer> subset = new ArrayList<>(result.get(j));
                subset.add(array.get(i));
                result.add(subset);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        List<List<Integer>> powerset = powerset1(input);

        for (List<Integer> subset : powerset) {
            System.out.println(subset);
        }

    }
}
