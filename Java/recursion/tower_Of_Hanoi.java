package recursion;
import java.util.*;

// transfer one disk in one step
// smaller disk are always kept on top of larger disk

public class tower_Of_Hanoi {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        towerOfHanoi(a, "S", "H", "D");
    }

    public static int i = 0;
    public static void towerOfHanoi(int a, String source, String helper, String dest) {
        if (a == 1) {
            System.out.println("the disk " + a + " is transfered from " + source + " to " + dest);
            i++;
            System.out.println(i + " steps");
            return;
        }
        towerOfHanoi(a-1, source, dest, helper);
        System.out.println("the disk " + a + " is transfered from " + source + " to " + dest);
        i++;
        System.out.println(i + " steps");
        towerOfHanoi(a-1, helper, source, dest);
    }

}