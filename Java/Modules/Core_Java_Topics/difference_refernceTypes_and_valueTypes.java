package Core_Java_Topics;

import java.util.Arrays;

public class difference_refernceTypes_and_valueTypes {
    public static void main(String[] args) {
        int firstIntValue = 10;
        int secondIntValue = firstIntValue;
        System.out.println("firstIntValue: " + firstIntValue + ", secondIntValue: " + secondIntValue);
        secondIntValue++;
        System.out.println("firstIntValue: " + firstIntValue + ", secondIntValue: " + secondIntValue); // only secondIntValue changed because both variables have separate addresses.

        int[] firstIntArray = new int[5];
        int[] secondIntArray = firstIntArray;
        System.out.println("firstIntArray:  " + Arrays.toString(firstIntArray) + "\nsecondIntArray: " + Arrays.toString(secondIntArray) );
        secondIntArray[0] = 1;
        System.out.println("firstIntArray:  " + Arrays.toString(firstIntArray) + "\nsecondIntArray: " + Arrays.toString(secondIntArray)) ; // both array values changed because both arrays have only one address.
    }
}
