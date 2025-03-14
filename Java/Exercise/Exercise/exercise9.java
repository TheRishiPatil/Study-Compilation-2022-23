package Exercise;

public class exercise9 {
    public static void main(String[] args) {
        printYearAndDays(1051200);
        printYearAndDays(561600);

        printmin(20, 4, 29);
    }

    public static void printYearAndDays(int min) {
        if (min < 0) {
            System.out.println("Invalid Value");
        }
        int year = min / 525600; 
        int remainingmin = min % 525600;
        int days = remainingmin / 1440;
            System.out.println(min + " min = " + year + " y and " + days + " d.");
    }

    public static void printmin(int year, int months, int days) {
        int newyear = year * 525600;
        int newmonths = months * 43200;
        int newdays = days * 1440;
        int min = newyear + newmonths + newdays;
        System.out.println(year + " y and " + months + "m and " + days + " d = " + min + " min.");
    }
}
