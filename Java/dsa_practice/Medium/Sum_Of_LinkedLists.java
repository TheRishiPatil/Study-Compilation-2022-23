public class Sum_Of_LinkedLists {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        StringBuilder str = new StringBuilder();
        int sum = 0;

        while (linkedListOne != null) {
            str.append(linkedListOne.value);
            linkedListOne = linkedListOne.next;
        }

        sum = Integer.parseInt(str.reverse().toString());
        str.setLength(0);

        while(linkedListTwo != null) {
            str.append(linkedListTwo.value);
            linkedListTwo = linkedListTwo.next;
        }

        sum += Integer.parseInt(str.reverse().toString());

        int currValue = sum % 10;
        sum /= 10;

        LinkedList list = new LinkedList(currValue);
        LinkedList head = list;

        while (sum > 0) {
            currValue = sum % 10;
            sum /= 10;
            list.next = new LinkedList(currValue);
            list = list.next;
        }

        return head;
    }
}
