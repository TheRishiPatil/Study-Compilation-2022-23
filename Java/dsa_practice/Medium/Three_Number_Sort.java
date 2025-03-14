public class Three_Number_Sort {
    // sort array with O(1) space and O(n) time complexity
    public static int[] threeNumberSort(int[] array, int[] order) {
        int count1 = 0, count2 = 0;
        for (int i : array) {
            if (i == order[0]) { count1++; }
            if (i == order[1]) { count2++; }
        }
        for (int i = 0; i < array.length; i++) {
            if (count1 != 0) {
                array[i] = order[0];
                count1--;
            } else if (count2 != 0) {
                array[i] = order[1];
                count2--;
            } else {
                array[i] = order[2];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, 0, -1, -1, 0, 1, 1};
        int order[] = {0, 1, -1};
        System.out.println(threeNumberSort(array, order));
    }
}
