import java.util.HashSet;
import java.util.Set;

public class Youngest_Common_Ancestor {

    public static AncestralTree getYoungestCommonAncestor(AncestralTree topAncestor, AncestralTree descendantOne,
            AncestralTree descendantTwo) {
        
        Set<AncestralTree> set = new HashSet<>();

        while (descendantOne != null) {
            set.add(descendantOne);
            descendantOne = descendantOne.ancestor;
        }

        while (descendantTwo != null) {
            if (set.contains(descendantTwo)) { return descendantTwo; }
            descendantTwo = descendantTwo.ancestor;
        }

        return null;
    }

    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }
    }
}
