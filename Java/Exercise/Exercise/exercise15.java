package Exercise;

public class exercise15 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(151));
    }

    public static boolean isPalindrome(int number) {
        int r, sum = 0, temp;
        int n = -85458;

        temp = n;
        while (n != 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            return true;
        else
            return false;
    }
}
