import java.util.ArrayList;

public class Valid_Ip_Address {
    public static ArrayList<String> validIPAddresses(String string) {
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < string.length() - 3; i++) {
            for (int j = i + 1; j < string.length() - 2; j++) {
                for (int k = j + 1; k < string.length() - 1; k++) {
                    String p1 = string.substring(0, i + 1);
                    String p2 = string.substring(i + 1, j + 1);
                    String p3 = string.substring(j + 1, k + 1);
                    String p4 = string.substring(k + 1);
                    if (isvalid(p1) && isvalid(p2) && isvalid(p3) && isvalid(p4)) {
                        String validString = p1 + "." + p2 + "." + p3 + "." + p4;
                        ans.add(validString);
                        System.out.println(validString);
                    }
  
                }
            }
        }
        return ans;
    }

    public static boolean isvalid(String point) {
        return (Integer.parseInt(point) < 256) && (point.length() > 1 && point.charAt(0) != '0') || (point.length() == 1);
    }

    public static void main(String[] args) {
        String question = "1921680";
        validIPAddresses(question);
    }
}
