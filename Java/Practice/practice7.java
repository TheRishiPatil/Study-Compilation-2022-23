public class practice7 {
    public static void main(String[] args) {
        System.out.println(getDurationStrng(130, 36));
        System.out.println(getDurationStrng(61, 00));
        System.out.println(getDurationStrng(4561));
        System.out.println(getDurationStrng(12345));
    }

    public static String getDurationStrng(int min, int sec) {
    if (min >= 0 && sec >= 0 && sec <= 59) 
        {
            int hour = min / 60;
            int remainingMin = min % 60;

            String hourString = hour + "H ";
        if (hour < 10) {
                hourString = "0" + hourString;
            }
            String minString = remainingMin + "Min ";
        if (hour < 10) {
                minString = "0" + minString;
            }
            String secString = sec + "Sec";
        if (hour < 10) {
                secString = "0" + secString;
            }
        return  "\n" + hourString + minString + secString;
        }         
    return "Invalid Value";       
    }


    private static String getDurationStrng(int sec) {
        if (sec >= 0) 
        {
            int min = sec / 60;
            sec = sec % 60;
        return getDurationStrng(min, sec);
        }
    return "Invalid Value";
    }
}