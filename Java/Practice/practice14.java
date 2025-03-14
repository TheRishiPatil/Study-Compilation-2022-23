public class practice14 {
    public static void main(String[] args) {
        String a = "rish";
        int b = a.length();
        int count = 0;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    count++;
                }
            }
        }
        if (count > 2) {
            System.out.println("Stop");
        } else if (count < 2) {
            System.out.println("Proceed");
        }
    }
}
