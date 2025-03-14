import java.util.ArrayList;

public class Cycle_In_Graph {

    static class Edge {
        int source;
        int dest;

        Edge(int s, int d) {
            this.source = s;
            this.dest = d;
        }
    }

    public boolean cycleInGraph(int[][] edges) {
        ArrayList<Edge>[] graph = new ArrayList[edges.length];

        for (int i = 0; i < edges.length; i++) {
            graph[i] = new ArrayList<>();
            for (int j = 0; j < edges[i].length; j++) {
                graph[i].add(new Edge(i, edges[i][j]));
            }
        }

        boolean[] visited = new boolean[edges.length];
        for (int i = 0; i < edges.length; i++) {
            if (hasCycle(graph, visited, i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasCycle(ArrayList<Edge>[] graph, boolean[] visited, int current) {
        if (visited[current]) {
            return true;
        }
        visited[current] = true;

        for (Edge edge : graph[current]) {
            int neighbor = edge.dest;
            if (hasCycle(graph, visited, neighbor)) {
                return true;
            }
        }

        visited[current] = false;
        return false;
    }

}
