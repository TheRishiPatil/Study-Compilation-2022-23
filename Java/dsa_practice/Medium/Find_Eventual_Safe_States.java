import java.util.ArrayList;
import java.util.List;

public class Find_Eventual_Safe_States {
    public List<Integer> eventualSafeNodes(int[][] list) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(list.length);
        for (int i = 0; i < list.length; i++) {
            graph.add(new ArrayList<>());
        }

        boolean vis[] = new boolean[list.length];
        boolean rec[] = new boolean[list.length];

        for (int i = 0; i < list.length; i++) {
            int[] curr = list[i];
            for (int j : curr){
                graph.add(i).add(j);
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (!hasCycle(graph, vis, rec, i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static boolean hasCycle(ArrayList<ArrayList<Integer>> graph, boolean vis[], boolean rec[], int curr){
        if(rec[curr]) { 
            return true; 
        }
        if (vis[curr]) {
            return false;
        }

        vis[curr] = true;
        rec[curr] = true;

        for (int i : graph.get(curr)){
            if (hasCycle(graph, vis, rec, i)) {
                return true;
            }
        }

        rec[curr] = false;
        return false;
    }
}
