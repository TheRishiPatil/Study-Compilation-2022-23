package Exercise;

public class exercise16 {
    public static void main(String[] args) {
        sumFirstAndLastDigit(1);
    }

    public static void sumFirstAndLastDigit(int num) {
        int reverse = 0;
        int last;
        int first;
        if (num < 0) {
            System.out.println("-1");
        } else {
            last = num % 10;
            while (num != 0) {
                reverse = num % 10;
                num = num / 10;
            }
            first = reverse % 10;
            int sum = first + last;
            System.out.println(sum);
        }
    }
}
