package Comapany_Q;

import java.util.Scanner;

public class trilogyQ1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int b = 2;
            int length = a.length;
            int total[] = new int[length];
            int finaltotal = 0;
            int k = 0;
                for (int j = 1; j <= length; j++) {
                    total[k] += a[j-1];
                    if (j%3 == 0) {
                        k++;
                    }
                }
            for (int i = 0; i < b; i++) {
                finaltotal += Math.pow(total[i], 2);
            }
        System.out.println(finaltotal);
    }
}


// public class Solution {
//     public Long solve(ArrayList<Integer> a, int b) {
//         int[] n = (int[])a.toArray(int[a.size()]);
//         int length = n.length;
//         int total[] = new int[length];
//         long finaltotal = 0;
//         int k= 0;
//         for(int j = 1; j <= length; j++){
//             total[k] += n[j-1];
//             if(j%3 == 0){
//                 k++;
//             }
//         }
//         for(int i = 0; i< b; i++){
//             finaltotal += Math.pow(total[i], 2);
//         }
//         return finaltotal;
//     }
// }