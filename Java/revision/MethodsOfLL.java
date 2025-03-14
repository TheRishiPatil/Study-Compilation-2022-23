package Data_Structure;
import java.util.Iterator;
import java.util.LinkedList;

public class MethodsOfLL {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        for (int i = 1; i < 11; i++) {
            list.add(i); // add the element to the end of this list.
        }
        list.add(0, 0); // add the element at the specified position in this list.

        list.addAll(list); // add all elements from list in this list.

        list.addAll(11, list); // add all elements from the list at the specified position in this list.

        list.addFirst('A'); // add the element at the beginning of this list.
        
        list.addLast("Z"); // add the element to the end of this list.

        list.clear(); // clear the list.

        for (int i = 1; i < 11; i++) {
            list.add(i);
        }

        LinkedList newlist = (LinkedList) list.clone(); // copy all the elements from list to this newlist.

        System.out.println(newlist.contains(10)); // return true if the specified element is present in this newlist.

        System.out.println(newlist.containsAll(list)); // return true if all the elements is present in this newlist.

        {Iterator<Integer> list2 = newlist.descendingIterator(); // return list2 in the reverse order.

        while(list2.hasNext()){
            System.out.print(list2.next() + " ");
        }
        System.out.println();}

        System.out.println(newlist.element()); // return the head of this newlist.

        System.out.println(newlist.get(2)); // return the element at the specified position in this newlist.

        System.out.println(newlist.getFirst()); // return the first element in this newlist.

        System.out.println(newlist.getLast()); // return the last element in this newlist.

        System.out.println(newlist.indexOf(3)); // return the index of first occurrence of specified element in this newlist.

        newlist.add(3);

        System.out.println(newlist.lastIndexOf(3)); // return the index of last occurrence of specified element in this newlist.

        {Iterator<Integer> list2 = newlist.listIterator(2); // copy all the elements from specified index from newlist to list2

        while (list2.hasNext()) {
            System.out.print(list2.next() + " ");
        }
        System.out.println();}

        newlist.offer(12); // add the element at the start(head) in this list else return false.

        newlist.offerFirst(0); // add the element at the start in this list else return false.

        newlist.offerLast(13); // add the element at the end in this list else return false.

        System.out.println(newlist.peek()); // return the first(head) element of this newlist, return null if newlist is empty.

        System.out.println(newlist.peekFirst()); // return the first element of this newlist, return null if newlist is empty.

        System.out.println(newlist.peekLast()); // return the last element of this newlist, return null if newlist is empty.

        newlist.poll(); // remove the first(head) element of this newlist.

        newlist.pollFirst(); // remove the first element of this newlist.

        newlist.pollLast(); // remove the last element of this newlist.

        System.out.println(newlist.pop()); // first return first element and and then remove it from this newlist.

        newlist.push(1); // add the element at the start of this newlist.

        newlist.remove(); // remove the first element of this newlist.

        newlist.remove(4); // remove the element at the specified index in this newlist.
        
        newlist.remove(newlist.equals(5)); // Removes the first occurrence of the specified element from this list, if it is present.

        System.out.println(newlist.removeFirst()); // Removes and returns the first element from this list.

        System.out.println(newlist.removeLast()); // Removes and returns the last element from this list.

        newlist.removeFirstOccurrence(4); // Removes the first occurrence of the specified element in this list.

        newlist.removeLastOccurrence(10); // Removes the last occurrence of the specified element in this list.

        newlist.set(4, 10); // Replaces the element at the specified position in this list with the specified element.

        System.out.println(newlist.size()); // Returns the number of elements in this list.

        // newlist.spliterator();

        {Object[] arr = newlist.toArray(); // Returns an array containing all of the elements in this list in proper sequence (from first to last element).

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }}

        System.out.println(newlist); 
    }
}
