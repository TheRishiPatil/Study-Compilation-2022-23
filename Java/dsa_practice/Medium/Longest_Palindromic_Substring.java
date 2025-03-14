public class Longest_Palindromic_Substring {
    
    public static String longestPalindrome(String s) {
        String result = "";
        int resultLength = 0;

        for (int i = 0; i < s.length(); i++) {
            // odd length
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if ((right - left + 1) > resultLength) {
                    result = s.substring(left, right + 1);
                    resultLength = right - left + 1;
                }
                left--;
                right++;
            }

            // even length
            left = i; right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if ((right - left + 1) > resultLength) {
                    result = s.substring(left, right + 1);
                    resultLength = right - left + 1;
                }
                left--;
                right++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String s = "abcdedcbafghgfabcde";
        System.out.println(longestPalindrome(s));
    }
}
