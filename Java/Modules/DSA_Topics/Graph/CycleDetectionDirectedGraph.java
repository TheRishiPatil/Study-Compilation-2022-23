package DSA_Topics.Graph;
import java.util.ArrayList;

public class CycleDetectionDirectedGraph{
    static class Edge{
        int src;
        int dst;
        Edge(int s, int d){
            this.src = s;
            this.dst = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i =0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    public static boolean cycleDetection(ArrayList<Edge> graph[], int curr, boolean[] vis, boolean[] rec){
        vis[curr] = true;
        rec[curr] = true;
        
        for (int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dst]){
                return true;
            }
            else if (!vis[e.dst]){
                if (cycleDetection(graph, e.dst, vis, rec)){
                    return true;
                } else {
                    cycleDetection(graph, e.dst, vis, rec);
                }
            }
        }

        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[]  = new boolean[V];
        boolean rec[]  = new boolean[V];
        boolean isCycle = false;

        for (int i = 0; i < V; i++) {
            isCycle = cycleDetection(graph, 0, vis, rec);
            if (isCycle) {
                break;
            }
        }
        System.out.println(isCycle ? true : false);
        
    }
}