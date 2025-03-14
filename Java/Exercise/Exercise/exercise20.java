package Exercise;

public class exercise20 {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(120,200));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        for (int i = Math.min(first, second); i <= Math.min(first, second); i--) {
            if (first % i == 0 && second % i == 0) {
                if (first % i == second % i) {
                    return i;
                }
            }
        }
        return -1;
    }
}
