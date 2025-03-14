public class Remove_Kth_Node_From_End {
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        int size = 0;
        LinkedList temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int idx = size - k;

        if (idx == 0) {
            head.value = head.next.value;
            head.next = head.next.next;
            return;
        }

        for (int i = 0; i < idx - 1; i++) {
            head = head.next;
        }

        head.next = head.next.next;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
