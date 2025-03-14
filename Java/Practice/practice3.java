public class practice3 {
    public static void main(String[] args) {
        Double a = 20.00;
        Double b = 80.00;
        Double c = (a + b) * 100;
        System.out.println("Output is " +  c);
        c = c % 40.00;
        System.out.println("Remainder of output is " +  c);

        boolean i = (c == 0) ? true : false;
        System.out.println(i);

        if (!i) {
            System.out.println("Got some remainder");
        }
    }
}
