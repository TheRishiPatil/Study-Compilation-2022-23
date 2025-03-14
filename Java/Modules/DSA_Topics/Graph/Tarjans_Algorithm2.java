package DSA_Topics.Graph;
import java.util.ArrayList;

public class Tarjans_Algorithm2 {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static public void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        // graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        // graph[3].add(new Edge(3, 0));
        // graph[3].add(new Edge(3, 4));

        // graph[4].add(new Edge(4, 3));
    }

    public static void getAp(ArrayList<Edge> graph[], int V) {
        int time = 0;
        int dt[] = new int[V];
        int low[] = new int[V];
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V]; // Articulation Point

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, 0, time, dt, low, vis, ap, -1);
            }
        }

        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                System.out.println("Ancester in graph: " + i);
            }
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

    public static void main(String[] args) {
        int V = 3;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getAp(graph, V);
    }
}
