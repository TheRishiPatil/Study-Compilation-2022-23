package DSA_Topics.Graph;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims_Algorithm {
    static class Edge {
        int src;
        int dst;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }

    static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        Pair(int n, int c) {
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    public static int prims(ArrayList<Edge> graph[], int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // non mst
        boolean vis[] = new boolean[V]; // mst
        pq.add(new Pair(0, 0));
        int mstCost = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.node]) {
                System.out.println(curr.node + " " + curr.cost);
                vis[curr.node] = true;
                mstCost += curr.cost;
                for (Edge e : graph[curr.node]) {
                    if (!vis[e.dst]) {
                        pq.add(new Pair(e.dst, e.wt));
                    }
                }
            }
        }
        return mstCost;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println("Total Cost: " + prims(graph, V));
    }
}
