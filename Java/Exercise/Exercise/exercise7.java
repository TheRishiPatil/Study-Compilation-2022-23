package Exercise;

public class exercise7 {
    public static void main(String[] args) {
        boolean teen = hasTeen(56, 67, 18);
        boolean heen = isTeen(18);
        System.out.println(teen);
        System.out.println(heen);
    }

    public static boolean hasTeen(int a, int b, int c){
        if ((a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20)) {
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isTeen(int one) {
        if (one > 12 && one < 20){
            return true;
        }
        return false;
    }
}
