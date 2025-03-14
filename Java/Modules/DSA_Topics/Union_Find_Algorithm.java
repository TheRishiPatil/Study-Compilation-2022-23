import java.util.HashMap;

public class Union_Find_Algorithm {
    HashMap<Integer, Integer> parents = new HashMap<>();
    HashMap<Integer, Integer> ranks = new HashMap<>();

    // O (1)
    public void createSet(int value) {
        parents.put(value, value);
        ranks.put(value, 0);
    }

    // O (alpha(n)) == O (1)
    public Integer find(int value) {
        if (!parents.containsKey(value)) {
            return null;
        }

        if (value != parents.get(value)) {
            parents.put(value, find(parents.get(value)));
        }
        return parents.get(value);
    }

    // O (alpha(n)) == O (1)
    public void union(int valueOne, int valueTwo) {
        if (!parents.containsKey(valueOne) || !parents.containsKey(valueTwo)) {
            return;
        }

        int parentOne = find(valueOne);
        int parentTwo = find(valueTwo);

        if (ranks.get(parentOne) > ranks.get(parentTwo)) {
            parents.put(parentTwo, parentOne);
        } else if (ranks.get(parentOne) < ranks.get(parentTwo)) {
            parents.put(parentOne, parentTwo);
        } else {
            parents.put(parentTwo, parentOne);
            ranks.put(parentOne, ranks.get(parentOne) + 1);
        }
    }
}
