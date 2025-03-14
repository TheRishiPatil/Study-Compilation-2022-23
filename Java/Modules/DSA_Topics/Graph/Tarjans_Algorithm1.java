package DSA_Topics.Graph;
import java.util.ArrayList;
// Bridge in graph
public class Tarjans_Algorithm1 {
    static class Edge{
        int src;
        int dst;

        Edge(int src, int dst){
            this.src = src;
            this.dst = dst;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }

    public static void getBridge(ArrayList<Edge> graph[], int V){
        int time = 0;
        int dt[] = new int[V]; // discovery time
        int low[] = new int[V]; // lowest discovery time for comparision
        boolean vis[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis, time, dt, low, -1);
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[], int time, int dt[], int low[], int parent){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for(Edge e : graph[curr]){
            if (e.dst == parent) {
                continue;
            } else if (!vis[e.dst]) {
                dfs(graph, e.dst, vis, time, dt, low, curr);
                low[curr] = Math.min(low[curr], low[e.dst]);
                if (dt[curr] < low[e.dst]) {
                    System.out.println("Bridge: " + curr + " --> " + e.dst);
                }
            } else{
                low [ curr] = Math.min(low[curr], dt[e.dst]);
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getBridge(graph, V);
    }
}
