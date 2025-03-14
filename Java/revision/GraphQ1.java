package revision;
import java.util.*; 
// all paths form source to target
public class GraphQ1 {
    static class edge{
        int src;
        int dst;
        edge(int s, int d){
            this.src = s;
            this.dst = d;
        }
    }

    public static void createGraph(ArrayList<edge> graph[], int V){
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 3));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 4));

        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 4));
        graph[3].add(new edge(3, 5));

        graph[4].add(new edge(4, 2));
        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4, 5));

        graph[5].add(new edge(5, 3));
        graph[5].add(new edge(5, 4));
        graph[5].add(new edge(5, 6));
        graph[5].add(new edge(6, 5));
    }

    public static void dfs(ArrayList<edge> graph[], int curr, boolean vis[], String path, int target){
        if (curr == target) {
            System.out.println(path);
            return;
        }

        for(int i = 0; i < graph[curr].size(); i++){
            edge e = graph[curr].get(i);
            if (vis[e.dst] == false) {
                vis[curr] = true;
                dfs(graph, e.dst, vis, path + " --> " + e.dst, target);
                vis[curr] = false;
            }
        }
    }
    public static void main(String args[]){ // O (V ^ V)
        int V = 7;
        int target = 5, src = 0;
        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        /*
        one graph
         1 ---  3
        /       | \
       0        |  5 -- 6
        \       | /
         2 ---- 4
        */
        dfs(graph, src, new boolean[V], "0", target);
    }
}