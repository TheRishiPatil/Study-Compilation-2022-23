package Comapany_Q;

import java.util.Scanner;

// Odd and Even

public class vectorQ2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }

    public static String solution(int[] arr) {

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++) // if array have same integer then don't count
                if (arr[i] == arr[j]) {
                    break;
                }
            if (i == j) {
                if (arr[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }
        if (evenCount % 2 == 0 && oddCount % 2 != 0) {
            return "YES";
        }
        return "No";
    }
}
