
import java.util.ArrayList;

public class randomQuestion1 {
    public static int[] primes(int n) {
        int count = 3;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);

        for (int i = 6; i < 1000; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                list.add(count++, i);
                if (count == n) {
                    break;
                }
            }
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 11;
        int m = 3;
        int[] result = primes(m);
        int ans = n;
        while (ans > 0 ) {
            for (int i = 0; i < result.length; i++) {
                
            }
        }
        
    }
}