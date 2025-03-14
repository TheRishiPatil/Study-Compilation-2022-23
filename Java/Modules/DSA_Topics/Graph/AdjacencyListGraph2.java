package DSA_Topics.Graph;
import java.util.*;
// un-directed weighted graph
public class AdjacencyListGraph2 {
    static class edge{
        int source;
        int destiny;
        int weight;

        public edge(int s, int d, int w){
            this.source = s;
            this.destiny = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<edge> graph[], int V){
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        
        graph[0].add(new edge(0, 2, 2));

        graph[1].add(new edge(1, 2, 10));
        graph[1].add(new edge(1, 3, 0));

        graph[2].add(new edge(2, 0, 2));
        graph[2].add(new edge(2, 1, 10));
        graph[2].add(new edge(2, 3, -1));

        graph[3].add(new edge(3, 1, 0));
        graph[3].add(new edge(3, 2, -1));
    }
    public static void main(String args[]){
        int V = 4;
        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        for(int i = 0; i < graph[2].size(); i++){
            edge e = graph[2].get(i);
            
            System.out.println("destiny: " + e.destiny + " | weight: " + e.weight);
        }
    }
}
