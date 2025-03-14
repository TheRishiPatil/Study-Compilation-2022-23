package Core_Java_Topics;

import java.util.*;

public class array_input {
    
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] myInt = getInteger(num);
        for (int i = 0; i < myInt.length; i++) {
        System.out.println("The values of [" + i + "] are: " + myInt[i]);
        }
        System.out.println("The average is " + getAverage(myInt));
    }

    private static int[] getInteger(int num) {
        System.out.println("Enter " + num + " integer values.");
        int[] values = new int[num];

        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}