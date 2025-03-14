package Exercise;

public class exercise24 {
    public static void main(String[] args) {
        System.out.println(canPack(0,5,4));
    }

    public static Boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (((bigCount * 5) + (smallCount * 1) >= goal)) {
            if (goal % 5 < smallCount) {
                return true;
            }
        }
        return false;
    }
}
