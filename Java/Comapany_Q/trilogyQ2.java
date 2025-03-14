package Comapany_Q;

public class trilogyQ2 {
    // check whether the difference between array values are same or not.
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int minus = 0;
        boolean ans = true;
        for (int i = 2; i < a.length; i++) {
            minus = a[1] - a[0];
            if (a[i] - a[i-1] != minus) {
                ans = false;
                break;
            }
        }
        if (ans == false) {
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
}
