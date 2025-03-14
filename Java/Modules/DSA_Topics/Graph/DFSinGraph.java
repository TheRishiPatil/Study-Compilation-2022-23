package DSA_Topics.Graph;
import java.util.*;

public class DFSinGraph {
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

    public static void dfs(ArrayList<edge> graph[], int curr, boolean[] vis){
        if(vis[curr]) {
            return;
        }    
        System.out.println(curr);
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            dfs(graph, e.dst, vis);
        }
    }
    public static void main(String[] args){
        int V = 7;
        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        /*
        one graph
         1 ---  3
        /       | \
       0        |  5 -- 6
        \       | /
         2 ---- 4
        */
        dfs(graph, 0, vis);
        System.out.println();
        /*
        multiple graph
        0 --- 1 --- 2
        3 --- 4
        */
        boolean vis2[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (vis2[i] == false) {
                dfs(graph, i, vis2);
            }
        }
    }
}
