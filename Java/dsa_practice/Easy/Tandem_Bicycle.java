import java.util.Arrays;
import java.util.Collections;

public class Tandem_Bicycle {
    public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        int negOrPos = fastest ? -1 : 1; // decide positive or negative
        int direction = fastest ? redShirtSpeeds.length - 1 : 0; // 0 or length - 1
        int sum = 0, i = 0;
        while (i < redShirtSpeeds.length) {
            sum += Math.max(redShirtSpeeds[i++], blueShirtSpeeds[direction]);
            direction += negOrPos;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] red = {3, 6, 7, 2, 1};
        int[] blue = {5, 5, 3, 9, 2};
        boolean is = false;
        System.out.println(tandemBicycle(red, blue, is));

    }
}
