import java.util.Scanner;

public class p28_2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int temp1 = 0, temp2 = 0, temp3 = Integer.MAX_VALUE, count = 0;
        String temp = Integer.toString(n);
        int[] num = new int[temp.length()];
        do {
            temp1 = n % 10;
            temp2 = 9 - temp1;
            if (temp2 < temp3) {
                temp3 = temp2;
            }
            n = n / 10;
            count--;
        } while (n == 0);
        
        for (int i = 0; i < temp.length(); i++) {
            num[i] = temp.charAt(i) - '0';
        }
        num[count] = temp3;

        int result = 0;

		for (int i = 0; i < temp.length(); i++)
		{
			int digit = num[i] - '0';
			result *= 10;
			result += digit;
		}

        System.out.println(result);
    }
}