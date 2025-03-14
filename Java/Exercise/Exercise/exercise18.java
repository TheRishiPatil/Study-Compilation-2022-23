package Exercise;

public class exercise18 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(55, 66));        
    }

    public static boolean hasSharedDigit(int a, int b) {
        int left_a = a / 10;
        int right_a = a % 10;
        int left_b = b / 10;
        int right_b = b % 10;
        if (a > 100 || a < 10 || b > 100 || b < 10) {
            return false;
        }if (left_a == left_b || left_a == right_b || right_a == left_b || right_a == right_b ) {
            return true;
        }
        return false;
    }

}
