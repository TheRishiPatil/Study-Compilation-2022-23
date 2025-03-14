package Exercise;
import java.util.Scanner;

public class exercise43 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int number = sc.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        reverse(array);
    }

    public static void reverse(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
