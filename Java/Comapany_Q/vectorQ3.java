package Comapany_Q;

import java.util.Arrays;
import java.util.Scanner;

public class vectorQ3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a =sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == temp) {
                    count++;
                }
            }
            if (count == temp) {
                if (temp > ans) {
                    ans = temp;
                }
            }
        }

        return ans;
    }
}
