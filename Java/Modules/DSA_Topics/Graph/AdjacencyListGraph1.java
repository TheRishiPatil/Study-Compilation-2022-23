package DSA_Topics.Graph;
import java.util.*;
// un-directed un-weighted graph
public class AdjacencyListGraph1{
    static class edge{
        int source;
        int destiny;

        public edge(int s, int d){
            this.source = s;
            this.destiny = d;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]){
        for (int i = 0; i < graph.length; i++) { // this loop is imp. it put "empty arraylists" in place of "null" in array.
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 2));

        graph[1].add(new edge(1, 2));
        graph[1].add(new edge(1, 3));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));
        graph[2].add(new edge(2, 3));

        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 2));
    }
    public static void main(String[] args){
        int V = 4; 
        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);
        
        for (int i = 0; i < graph[2].size(); i++) {
            edge e = graph[2].get(i);
            System.out.println(e.destiny);
        }
    }
}