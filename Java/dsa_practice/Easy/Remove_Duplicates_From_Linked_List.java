
public class Remove_Duplicates_From_Linked_List {
    public static class LinkedList {
        public int value;
        public LinkedList next;
    
        public LinkedList(int value) {
          this.value = value;
          this.next = null;
        }
    }

    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList curr = linkedList;
        while (curr != null ) {
            LinkedList nextNode = curr.next;
            while (nextNode != null && nextNode.value == curr.value) {
                nextNode = nextNode.next;
            }
            curr.next = nextNode;
            curr = curr.next;
        }
        return linkedList;
    }
}
