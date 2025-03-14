package Exercise;

public class exercise19 {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(15, 55, 665));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) == true && isValid(b) == true && isValid(c) == true) {
            a = a % 10;
            b = b % 10;
            c = c % 10;
            if (a == b || b == c || c == a) {
                return true;
            }
        }
        return false;

    }

    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000) {
            return true;
        }
        return false;
    }
}
