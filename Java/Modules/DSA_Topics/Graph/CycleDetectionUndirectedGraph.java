package DSA_Topics.Graph;
import java.util.ArrayList;

public class CycleDetectionUndirectedGraph {
    static class Edge {
        int src;
        int dst;

        Edge(int s, int d) {
            this.src = s;
            this.dst = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        // graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        // graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }

    public static boolean isCycle(ArrayList<Edge> graph[], boolean vis[], int curr, int parent) {
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (vis[e.dst] && e.dst != parent) {
                return true;
            } else if (!vis[e.dst]) {
                if (isCycle(graph, vis, e.dst, curr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean ans = false;
        boolean vis[] = new boolean[V];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycle(graph, vis, 0, -1)) {
                    ans = true;
                    break;
                }
            }
        }
        System.out.println(ans ? true : false);
    }
}
