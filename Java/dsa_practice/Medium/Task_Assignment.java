import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Task_Assignment {
    public ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < tasks.size(); i++)
            indices.add(i);

        Collections.sort(indices, Comparator.comparingInt(tasks::get));

        int start = 0, end = tasks.size() - 1;
        while (start < end) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(indices.get(start));
            temp.add(indices.get(end));
            result.add(temp);
            start++;
            end--;
        }

        return result;
    }
}