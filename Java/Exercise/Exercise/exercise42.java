package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class exercise42 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        readInteger();
    }

    private static void readInteger() {
        System.out.print("Enter the number: ");
        int elements = sc.nextInt();
        readElements(elements);
    }

    private static int[] readElements(int elements){
        int[] array = new int[elements];
        for (int i = 0; i < elements; i++) {
            array[i] = sc.nextInt();
        }
        findMin(array);
        return array;
    }

    private static void findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        int[] tempArray = array;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
       System.out.println("The min value of Array" + Arrays.toString(tempArray) + " is: " + min);
    }
}