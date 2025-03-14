import java.util.*;

public class Critical_Connections_in_a_Network {

    public class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int time, int dt[], int low[], boolean vis[], boolean ap[], int parent) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;
        
        for (Edge e : graph[curr]) {
            if (e.dest == parent) {
                continue;
            } else if (vis[e.dest]) {
                low[curr] = Math.min(low[curr], dt[e.dest]);
            } else{
                dfs(graph, e.dest, time, dt, low, vis, ap, curr);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if (parent != -1 && dt[curr] <= low[e.dest]) {
                    ap[curr] = true;
                }
                children++;
            }
        }
        if (parent == -1 && children > 1) {
            ap[curr] = true;
        }
    }

    public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if (n <= 2) {
            for (List<Integer> connection : connections) {
                ans.add(connection);
            }
            return ans;
        } 
        else {
            ArrayList<Edge> graph[] = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }

            for (List<Integer> it : connections) {
                int u = it.get(0); int v = it.get(1);
                graph[u].add(new Edge(u, v));
                graph[v].add(new Edge(v, u));
            }

            int time = 0;
            int dt[] = new int[n];
            int low[] = new int[n];
            boolean vis[] = new boolean[n];
            boolean ap[] = new boolean[n];

            for (int i = 0; i < n; i++) {
                if (!vis[i]) {
                    dfs(graph, i, time, dt, low, vis, ap, -1);
                }
            }
            List<Integer> inside = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (ap[i]) {
                    inside.add(i);
                }
            }
            ans.add(inside);
            return ans;
        }
    }
}
