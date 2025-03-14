package Exercise;

public class exercise5 {
    public static void main(String[] args) {
        boolean a = areEqualByThreeDecimalPlaces(2.1566,  2.1564);
        System.out.println(a);
    }

    public static Boolean areEqualByThreeDecimalPlaces( Double Decimal1, Double Decimal2) {
        int decimal1 = (int) (Decimal1 * 1000);
        int decimal2 = (int) (Decimal2 * 1000);

        if (decimal1 == decimal2) {
            return true;
        }
        else return false;
    }
}
