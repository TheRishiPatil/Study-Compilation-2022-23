import javax.security.auth.login.CredentialException;

public class Middle_Node {
    public static class LinkedList {
        public int value;
        public LinkedList next;
    
        public LinkedList(int value) {
          this.value = value;
          this.next = null;
        }
    }
    
    public LinkedList middleNode1(LinkedList linkedList) { // better but still time complexity is O (n)
        LinkedList fast = linkedList;
        LinkedList slow = linkedList;
        while (fast == null || fast.next == null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public LinkedList middleNode(LinkedList linkedList) { // O (n)
        int halfsize = (count(0, linkedList)) / 2;
        LinkedList curr = linkedList;
        while (halfsize != 0) {
            curr = curr.next;
            halfsize--;
        }
        return curr;
    }

    public static int count(int size, LinkedList linkedList) {
        LinkedList curr = linkedList;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }

}
