import java.util.ArrayList;
import java.util.List;

public class Depth_First_Search {
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
      array.add(name);
      // advanced for loop
      children.forEach(child -> child.depthFirstSearch(array)); // <-- samaj nhi aaya pr dhekke accha laga.
      // normal for loop
      for (Node child : children) {
        child.depthFirstSearch(array);
      }
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
