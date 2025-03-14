public class Binary_Search {
    public static int binarySearch(int[] array, int target) {
        return searchKrRahaHu(array, 0, array.length - 1, target);
    }

    public static int searchKrRahaHu(int[] arr, int start, int end, int target){
        if (start > end) {
            return -1;
        }
        int mid = (end + start) / 2;
        if (target > arr[mid]) {
            return searchKrRahaHu(arr, mid + 1, end, target);
        } else if (target < arr[mid]) {
            return searchKrRahaHu(arr, start,  mid - 1, target);
        } else {
            return mid;
        }         
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        System.out.println(binarySearch(arr,7));
    }
}
