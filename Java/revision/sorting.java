package Data_Structure.SortAlgo;
import java.util.Arrays;
import java.util.Scanner;

    /*
    Merge sort --> divide and conquer algorithm
    Quick sort --> pivot and partition
    Bubble sort --> largest number sort first (j = 0, j < a.length - i - 1, j++)
    Selection sort --> smallest number sort first (j = i + 1, j < a.length, j++)
    Insertion sort
    Shell sort
    */

public class sorting {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // bubble_sort(arr, n);
        // selection_sort(arr, n);
        // insertion_sort(arr, n);
        // merge_sort(arr, 0, arr.length);

        // JDK sort method uses modified quick sort algorithm:-
        Arrays.sort(arr);
        // only available n java 8:- if the data is big then parallelsort is fast compare to sort.
        Arrays.parallelSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void bubble_sort(int[] arr, int n) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selection_sort(int[] arr, int n) {
        n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }   
    }

    public static void insertion_sort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int newElement = arr[i];
            int j;
            for (j = i; j > 0 && arr[j - 1] > newElement; j--) {
                arr[j] = arr[j  - 1];
            }
            arr[j] = newElement;
        }
    }

    public static void merge_sort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start  + end) / 2;
        merge_sort(arr, start, mid);
        merge_sort(arr, mid, end);
        merge_array(arr, start, mid, end);
    }

    public static void merge_array(int[] arr, int start, int mid, int end) {
        if (arr[mid - 1] <= arr[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempindex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempindex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr, i, arr, start + tempindex, mid - i);
        System.arraycopy(temp, 0, arr, start, tempindex);
    }
}