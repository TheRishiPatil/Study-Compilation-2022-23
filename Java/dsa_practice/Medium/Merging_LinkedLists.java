import java.util.HashSet;

public class Merging_LinkedLists {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList mergingLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        HashSet<Integer> set = new HashSet<>();
        while (linkedListOne != null) {
            set.add(linkedListOne.value);
            linkedListOne = linkedListOne.next;
        }

        while (linkedListTwo != null) {
            if (set.contains(linkedListTwo.value)) {
                return linkedListTwo;
            }
            linkedListTwo = linkedListTwo.next;
        }
        return null;
    }
}
