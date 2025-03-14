import java.util.*;

public class Three_Number_Sum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        ArrayList<Integer []> finalAns = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(array);
        for (int i : array) {
            set.add(i);
        }
        for (int i = 0; i < array.length - 2; i++) {
            int firstNum = array[i];
            for (int j = i + 1; j < array.length - 1; j++) {
                int secondNum = array[j];
                int thirdNum = targetSum - firstNum - secondNum;
                if (set.contains(thirdNum) && thirdNum > secondNum) {
                    Integer[] arr = {firstNum, secondNum, thirdNum};
                    Arrays.sort(arr);
                    if (!finalAns.contains(arr)) {
                        finalAns.add(arr);
                    }
                }
            }
        }
        return finalAns;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 1, 2, -6, 5, -8, 6};
        int target = 0;
        List<Integer []> finalAns = threeNumberSum(arr, target);
        for (int i = 0; i < finalAns.size(); i++) {
           Integer[] arr1 = finalAns.get(i);
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }
}
