public class LinkedList_construction {
    static class DoublyLinkedList {
        public Node head;
        public Node tail;
        public int size;

        public void setHead(Node node) {
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                head.prev = node;
                head = node;
            }
            size++;
        }

        public void setTail(Node node) {
            if (tail == null) {
                setHead(node);
            } else {
                tail.next = node;
                node.prev = tail;
                tail = node;
                size++;
            }
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            if (nodeToInsert == null)
                return;

            if (node == head) {
                setHead(nodeToInsert);
            } else {
                nodeToInsert.prev = node.prev;
                nodeToInsert.next = node;
                node.prev.next = nodeToInsert;
                node.prev = nodeToInsert;
                size++;
            }
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            if (nodeToInsert == null)
                return;

            if (node == tail) {
                setTail(nodeToInsert);
            } else {
                nodeToInsert.prev = node;
                nodeToInsert.next = node.next;
                node.next.prev = nodeToInsert;
                node.next = nodeToInsert;
                size++;
            }
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            if (position <= 1) {
                setHead(nodeToInsert);
                return;
            }

            if (position > size) {
                setTail(nodeToInsert);
                return;
            }

            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }

            nodeToInsert.prev = temp;
            nodeToInsert.next = temp.next;
            temp.next.prev = nodeToInsert;
            temp.next = nodeToInsert;
            size++;
        }

        public void removeNodesWithValue(int value) {
            Node current = head;
            while (current != null) {
                Node next = current.next;
                if (current.value == value) {
                    remove(current);
                }
                current = next;
            }
        }

        public void remove(Node node) {
            if (node == head) {
                head = head.next;
            }
            if (node == tail) {
                tail = tail.prev;
            }
            if (node.prev != null) {
                node.prev.next = node.next;
            }
            if (node.next != null) {
                node.next.prev = node.prev;
            }
            size--;
        }

        public boolean containsNodeWithValue(int value) {
            Node current = head;
            while (current != null) {
                if (current.value == value) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }

    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
