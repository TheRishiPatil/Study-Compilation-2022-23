import java.util.*;

public class Levenshtein_Distance {
    public static int levenshteinDistance(String str1, String str2) {
        int[][] ans = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i <= str1.length(); i++) {
            ans[i][0] = i;
        }
        for (int i = 0; i <= str2.length(); i++) {
            ans[0][i] = i;
        }
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) ans[i][j] = ans[i - 1][j - 1];
                else ans[i][j] = 1 + Math.min(Math.min(ans[i - 1][j], ans[i][j - 1]), ans[i - 1][j - 1]);
            }
        }
        return ans[str1.length()][str2.length()];
    }

    public static void main(String[] args) {
        String str1 = "abs";
        String str2 = "abc";
        System.out.println(levenshteinDistance(str1, str2));
    }
}
