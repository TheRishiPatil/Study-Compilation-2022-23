import java.util.*;

public class Common_Characters {
    public String[] commonCharacters(String[] str) {
        String min = str[0]; // find smallest string in array
        for (String i : str) {
            if (i.length() < min.length()) {
                min = i;
            }
        }
        HashSet<Character> set = new HashSet<>(); // store characters of min string in set
        for (char ch : min.toCharArray()) {
            set.add(ch);
        }

        for (String string : str) {
            HashSet<Character> check = new HashSet<>(); // store current string characters to this set called check
            for (char ch : string.toCharArray()) {
                check.add(ch);
            }

            set.retainAll(check); // Retain only the common characters between 'set' and 'check'
        }

        int i = 0;
        String[] ans = new String[set.size()];
        for (char ch : set) {
            ans[i++] = "" + ch;
        }

        return ans;
    }
}