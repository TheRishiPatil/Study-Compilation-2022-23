import java.util.*;
// using arraylist and linkedlist 
public class BFS {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> breadthFirstSearch(List<String> array) {
            Queue<Node> q = new LinkedList<>();
            List<String> ans = new ArrayList<>();
            q.add(this);
            while (!q.isEmpty()) {
                Node curr = q.poll();
                ans.add(curr.name);
                for (Node eachNode : curr.children) {
                    q.add(eachNode);
                }
            }
            return ans;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}