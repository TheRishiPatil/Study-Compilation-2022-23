public class Reverse_Word_In_String {
    public static String reverseWordsInString(String string) {
        String ans = "";
        StringBuilder newStr = new StringBuilder();
        for (char ch : string.toCharArray()) {
            newStr.append(ch);

            if (ch == ' ') {
                if (!newStr.isEmpty()) {
                    ans = newStr.toString() + ans;
                    newStr.setLength(0);
                }
            }
        }
        ans = newStr.toString() + " " + ans;
        return ans.substring(0, ans.length() - 1);
    }

    public static void main(String[] args) {
        String str = "APPLE   PEAR PLUM ORANGE";
        System.out.println(reverseWordsInString(str));
    }
}

// ORANGE PLUM PEAR   APPLE