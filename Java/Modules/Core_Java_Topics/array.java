package Core_Java_Topics;

public class array {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[4] = 5;
        //             OR
        int[] myIntArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            myIntArray[i] = i * 10;
        }
        System.out.println(myIntArray[4] + myIntArray2[4]);
    }
}
