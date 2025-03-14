public class practice1 {
    public static void main(String[] args) {
        byte i = 4;
        short j = 2;
        int k = 4;
        long m = 50000 + 10 * (i + j + k);
        System.out.println(m);

        short n = (short)(1000 + 10 * (i + j + k));
    //               ^== casting     
        System.out.println(n);
    }
}
