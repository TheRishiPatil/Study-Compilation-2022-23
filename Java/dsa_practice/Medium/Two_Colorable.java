import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Two_Colorable {
    public boolean twoColorable(int[][] edges) {
        Queue<Integer> q = new LinkedList<>();
        int vis[] = new int[edges.length];
        Arrays.fill(vis, -1);

        q.add(0);
        vis[0] = 1;
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int i : edges[curr]) {
                if (vis[i] == vis[curr]) {
                    return false;
                }

                if (vis[i] == -1) {
                    vis[i] = 1 - vis[curr];
                    q.add(i);
                }
            }
        }
        return true;
    }
}
