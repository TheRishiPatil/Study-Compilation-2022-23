import java.util.HashSet;
import java.util.Scanner;

public class p5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        HashSet<Integer> shoes = new HashSet<Integer>();
        for (int i = 0; i < 4; i++) {
            shoes.add(sc.nextInt());
        }
        System.out.println(4-shoes.size());
    }
}
