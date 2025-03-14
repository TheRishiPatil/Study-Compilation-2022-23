package Core_Java_Topics;

public class for_statement {
    public static void main(String[] args) {

        for (int i = 8; i > 1; i--) {
            System.out.println("10000 at inerest of " + i + "% is = " + 
            String.format("%.2f", calculateInterest(10000, i)));
        }
    }

    public static double calculateInterest(double amount, double i) {
        return (amount * (i / 100));
    }
}
