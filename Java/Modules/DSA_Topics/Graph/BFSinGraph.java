package DSA_Topics.Graph;
import java.util.*;

public class BFSinGraph {
    static class edge{
        int src;
        int dst;
        int weight;

        public edge(int s, int d, int w){
            this.src = s;
            this.dst = d;
            this.weight = w;
        }
    }
    
    public static void createGraph(ArrayList<edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));

        graph[1].add(new edge(1, 0, 1));
        graph[1].add(new edge(1, 3, 1));

        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 4, 1));

        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 5, 1));

        graph[4].add(new edge(4, 2, 1));
        graph[4].add(new edge(4, 3, 1));
        graph[4].add(new edge(4, 5, 1));

        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 4, 1));
        graph[5].add(new edge(5, 6, 1));
        graph[5].add(new edge(6, 5, 1));
    }

    public static void Bfs(ArrayList<edge> graph[], int V){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if (vis[curr] == false) {
                System.out.println(curr);
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    edge e = graph[curr].get(i);
                    q.add(e.dst);
                }
            }
        }
    }

    public static void Bfs2(ArrayList<edge> graph[], boolean vis2[], int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.remove();
            if (vis2[curr] == false) {
                System.out.println(curr);
                vis2[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    edge e = graph[curr].get(i);
                    q.add(e.dst);
                }
            }
        }
    }
    public static void main(String[] args){
        int V = 7;
        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);
        /*
        one graph
         1 ---  3
        /       | \
       0        |  5 -- 6
        \       | /
         2 ---- 4
        */
        Bfs(graph, V);
        System.out.println();

        /*
        multiple graph
        0 --- 1 --- 2
        3 --- 4
        */
        boolean vis2[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (vis2[i] == false) {
                Bfs2(graph, vis2, i);
            }
        }
    }
}
