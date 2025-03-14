public class Max_Subset_Sum_Of_No_Adjucent {
    public static int maxSubsetSumNoAdjacent(int[] arr1) { // solution 1
        int[] arr2 = new int[arr1.length];
        if (arr1.length == 0) return 0;
        if (arr1.length == 1) return arr1[0];
        if (arr1.length == 2) return Math.max(arr1[0], arr1[1]);
        if (arr1.length == 3) return Math.max((arr1[0] + arr1[2]), arr1[1]);
        arr2[0] = arr1[0];
        arr2[1] = arr1[1];
        arr2[2] = arr1[0] + arr1[2];
        for (int i = 3; i < arr1.length; i++) {
            arr2[i] = Math.max(arr2[i-2], arr2[i-3]) + arr1[i];
        }
        return Math.max(arr2[arr2.length - 1], arr2[arr2.length - 2]);
    }

    public static int maxSubsetSumNoAdjacent1(int[] arr1) { // solution 2
        int[] arr2 = new int[3];
        if (arr1.length == 0) return 0;
        if (arr1.length == 1) return arr1[0];
        if (arr1.length == 2) return Math.max(arr1[0], arr1[1]);
        arr2[0] = arr1[0];
        arr2[1] = Math.max(arr1[0], arr1[1]);
        for (int i = 2; i < arr1.length; i++) {
            arr2[2] = Math.max(arr2[0] + arr1[i], arr2[1]);
            arr2[0] = arr2[1];
            arr2[1] = arr2[2];
        }
        return arr2[1];
    }
}
