package recursion;

public class call_guests {
    public static void main(String[] args) {
        System.out.println(callGuests(5));
    }
    public static int callGuests(int n) {
        if (n <= 1) {
            return 1;
        }
        int single = callGuests(n-1);
        int pair = (n-1) * callGuests(n-2);
        return single + pair;
    }
}
