import java.net.Socket;

public class Edit_Distance {
    // Minimum Edit Distance

    public static void main(String[] args) {
        String str1 = "ABCAB";
        String str2 = "EACB";

        int prev[] = new int[str2.length() + 1];
        int curr[] = new int[str1.length() + 1];

        for (int i = 0; i < prev.length; i++) {
            prev[i] = i;
        }

        for (int i = 1; i < str1.length() + 1; i++) {
            curr[0] = i;

            for (int j = 1; j < str2.length() + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    curr[j] = prev[j - 1];
                } 
                else {
                    curr[j] = 1 + Math.min(curr[i - 1], Math.min(prev[j - 1], prev[j]));
                }
            }

            prev = curr.clone();
        }

        System.out.println(prev[str2.length()]);
    }
}
