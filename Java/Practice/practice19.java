import java.util.Arrays;
import java.util.Scanner;

public class practice19 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter count: ");
        int count = sc.nextInt();
        int[] tempArray = readIntegers(count);
        System.out.println("The min value of Array" + Arrays.toString(tempArray) + " is: " + findMin(tempArray));

    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (temp > array[i]) {
                temp = array[i];
            }
        }
        return temp;
    }
}
