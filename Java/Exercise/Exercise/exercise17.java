package Exercise;

public class exercise17 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(4466588));
    }

    public static int getEvenDigitSum(int num) {

        int sum = 0;
        int i;
        if (num < 0) {
            return -1;
        } else {
            while (num != 0) {
                i = num % 10;
                if (i % 2 == 0) {
                    sum += i;
                }
                num = num / 10;
            }
            return sum;
        }
    }
}