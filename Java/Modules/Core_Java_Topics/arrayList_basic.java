package Core_Java_Topics;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList_basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Elements
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // Get Elements
        System.out.println(list.get(2));

        // Add Element in between
        list.add(2, 10);
        System.out.println(list);

        // Set Element
        list.set(2, 3);
        System.out.println(list);

        // Delete Elements
        list.remove(3);
        System.out.println(list);

        // Loops
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Sorting
        Collections.sort(list);
        System.out.println(list);
    }   
}