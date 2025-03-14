package Exercise;

public class exercise25 {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(51));
    }

    public static int largestPrimeFactor(int n) {
        if (n <= 1) {
            return 0;
        } else {
            int div = 2;
            while (div < n) {
                if (n % div != 0) {
                    div++;
                } else {
                    n = n / div;
                    div = 2;
                }
            }
            return n;
        }
    }
}
