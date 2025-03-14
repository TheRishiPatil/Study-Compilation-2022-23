public class Best_Digits {
    public static String bestDigits(String number, int numDigits) {
        while (numDigits > 0) {
            int idx = -1;
            for (int i = 0; i < number.length() - 1; i++) {
                if (number.charAt(i) < number.charAt(i + 1)) {
                    idx = i;
                    break;
                }
            }    
            if (idx == -1) {
                return number.substring(0, number.length() - numDigits);
            }
            number = number.substring(0, idx) + number.substring(idx + 1);
            numDigits--;
        }
        return number;
    }
    
    public static void main(String[] args) {
        String str = "462839";
        int digit = 2;
        System.out.println(bestDigits(str, digit));
    }
}