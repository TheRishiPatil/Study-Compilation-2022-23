package Exercise;

public class exercise3 {
    public static void main(String[] args) {
        boolean print = shouldWakeUp( false, 2);
        System.out.println(print);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        
        if (hourOfDay >= 0 || hourOfDay <= 23)
        {
            if ((barking  == true) && (hourOfDay < 8 || hourOfDay > 22)) 
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
