package DSA_Topics.Graph;
import java.util.*;

public class Kosarajus_Algorithm {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
    }

    public static void TopologicalSorting(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> list) {
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                TopologicalSorting(graph, e.dest, vis, list);
            }
        }

        list.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " ");
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void kosarajuAlgo(ArrayList<Edge> graph[], int V) {
        // Step 1
        Stack<Integer> list = new Stack<>(); // O (V + E)
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                TopologicalSorting(graph, i, vis, list);
            }
        }

        // Step 2
        ArrayList<Edge> transpose[] = new ArrayList[V]; // O (V + E)
        for (int i = 0; i < V; i++) {
            transpose[i] = new ArrayList<>();
        }
        for (int i = 0; i < V; i++) {
            vis[i] = false;
            for (Edge e : graph[i]) {
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Step 3
        while (!list.isEmpty()) { // O (V + E)
            int curr = list.pop();
            if (!vis[curr]) {
                System.out.print("Strongest Connected Components: ");
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosarajuAlgo(graph, V);
    }

}
