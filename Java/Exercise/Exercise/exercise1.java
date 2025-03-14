package Exercise;

public class exercise1 {
    public static void main(String[] args) {
        toMilesPerHour(10.25);
        toMilesPerHour(-5.6);
        toMilesPerHour(75.114);

    }

    public static void toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour >= 0) {
            long MilesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + MilesPerHour + " mi/h");

        } else {
            System.out.println("Invalid Value");
        }
    }
}
