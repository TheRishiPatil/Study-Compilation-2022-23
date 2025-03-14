package Exercise;

public class exercise23 {
    public static void main(String[] args) {
        numberToWords(1203000);
    }

    public static void numberToWords(int num) {
        int original = num;
        num = reverse(num);
        int a, b;
        if (num < 0) {
            System.out.println("Invalid Value");
        }
        do {
            a = num % 10;
            num = num / 10;
            switch (a) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } while (num != 0);
        do {
            b = original % 10;
            original /= 10;
            if (b == 0) {
                System.out.println("Zero");
            }
        } while (original != 0);
    }

    public static int reverse(int num) {
        int sum = 0;
        while (num != 0) {
            sum = (sum * 10) + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}
