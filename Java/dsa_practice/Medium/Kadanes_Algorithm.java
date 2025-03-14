public class Kadanes_Algorithm {
    public static int kadanesAlgorithm(int[] array) {
        int finalSum = Integer.MIN_VALUE;
        int tempSum = 0;
        for(int curr : array){
            finalSum = Math.max(tempSum + curr, finalSum);
            tempSum = Math.max(tempSum + curr, 0);
        }
        return finalSum;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
        System.out.println(kadanesAlgorithm(arr));
    }
}
