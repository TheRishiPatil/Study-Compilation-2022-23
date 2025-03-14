package DSA_Topics;
import java.util.*;
class Arraylist{
    public static Scanner sc  = new Scanner(System.in);

    /*  Arraylist operations -->
        Add
        Get
        Modify
        Delete/remove
        Iterate/Operation
    */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            list.add(sc.nextInt());
            if (sc.nextInt() == '\n') {
                break;
            }
        }
        // get element
        System.out.println(list.get(0));

        // add element between list
        list.add(1, 1);
        System.out.println(list);

        // set element
        list.set(0, 5);

        // remove element
        list.remove(3);

        System.out.println(list.size());

        Collections.sort(list);
    }
}