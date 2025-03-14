public class Majority_Element{
    public static int majorityElement(int[] array) {
        int count = 0; int majority = array[0];
        for (int i = 0; i < array.length; i++) {
            if (count <= 0) {
                count = 0;
                majority = array[i];
            }
            if (majority != array[i]) {
                count--;
            } else {
                count++;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(majorityElement(arr));
    }
}