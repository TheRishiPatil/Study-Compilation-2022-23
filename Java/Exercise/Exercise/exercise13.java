package Exercise;

public class exercise13 {
    public static void main(String[] args) {
        System.out.println(IsLeapYear(2007));
    }

    public static boolean IsLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        else if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        return false;
    }
}
