package Exercise;

public class exercise22 {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(5));
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        if (num < 1) {
            return false;
        }
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
            if (num == sum) {
                return true;
            }
        }
        return false;
    }
}
