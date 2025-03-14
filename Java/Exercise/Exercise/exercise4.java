package Exercise;

public class exercise4 {
    public static void main(String[] args) {
        boolean a = isLeapYear( 2004);
        System.out.println(a);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 
            {
                System.out.println(year + " is a leap year");
                return true;
            }
            else
            {
                System.out.println(year + " is not a leap year");
                return false;
            }
        } 
        else 
        {
            return false;
        }
    }
}
