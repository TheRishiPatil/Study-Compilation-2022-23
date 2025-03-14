public class p17 {
    // private static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) throws Exception {
        int n = 4, cb = n * n, ch = 0, i = 0;
        do {
            ch = 1 + i;
            i++;
            System.out.println(ch);
        } while (ch != cb);
    }
}