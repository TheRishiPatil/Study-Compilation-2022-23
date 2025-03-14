package topics;
import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String args[]){
        HashSet<Integer> list = new HashSet<>();
        // insert
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        // search
        System.out.println(list.size());
        if (list.contains(2)) {
            System.out.println("List conatians 2");
        }
        // remove
        list.remove(2);

        // Iterator
        Iterator i = list.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}