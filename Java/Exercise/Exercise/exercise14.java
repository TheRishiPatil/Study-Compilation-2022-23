package Exercise;

public class exercise14 {
    public static void main(String[] args) {
        sumOdd(1, 100);
    }

    public static boolean isOdd(int number) {
        if ((number < 0) || (number % 2 == 0)) {
            return false;
        }
        return true;
    }

    public static void sumOdd(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i < 0 || end < 0) {
                count = -1;
                break;
            } else if (isOdd(i)) { 
                count += i;
            }
        }
        System.out.println(count);
    }
}