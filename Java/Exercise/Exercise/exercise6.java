package Exercise;

public class exercise6 {
    public static void main(String[] args) {
        boolean hehe = hasEqualSum(1, -1, 0);
        System.out.println(hehe);
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        if (a + b == c) {
            return true;
        }
        else{
            return false;
        }
    }
}
