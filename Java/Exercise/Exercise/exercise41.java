package Exercise;
import java.util.Arrays;
import java.util.Collections;

public class exercise41 {
    public static void main(String[] args) {
        Integer[] arr = {106, 26, 81, 5, 15};
        System.out.println("The original Array is: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array in Forward way: " + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted Array in Reverse way: " + Arrays.toString(arr));
    }
}