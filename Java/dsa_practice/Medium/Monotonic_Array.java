public class Monotonic_Array {
    public static boolean isMonotonic(int[] array) {
        if (array.length <= 1) {
            return true;
        }
        boolean down = array[0] > array[array.length - 1] ? true : false;
        for (int i = 1; i < array.length; i++) {
            if (down && array[i - 1] < array[i]) return false;
            if (!down && array[i - 1] > array[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -1, -2, -3, -4, -5, -5, -5, -6, -7, -8, -8, -9, -10, -11};
        System.out.println(isMonotonic(arr));
    }
}
