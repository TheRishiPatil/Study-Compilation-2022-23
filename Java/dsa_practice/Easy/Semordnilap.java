import java.util.ArrayList;
import java.util.HashSet;

public class Semordnilap {
    public ArrayList<ArrayList<String>> semordnilap(String[] words) {
        ArrayList<ArrayList<String>> newList = new ArrayList<>();
        if (words.length == 0 || words.length == 1) {
            return newList;
        }
        HashSet<String> set = new HashSet<>();
        for (String string : words) {
            set.add(string);
        }
        for (int i = 0; i < words.length; i++) {
            String curr = words[i];
            String rev = "";
            ArrayList<String> innerList = new ArrayList<>();
            for (int j = curr.length() - 1; j >= 0; j--) {
                rev += curr.charAt(j);
            }
            if (set.contains(rev)) {
                if (curr.equals(rev)) {
                    set.remove(curr);
                } else {
                    innerList.add(curr);
                    innerList.add(rev);
                    set.remove(curr);
                    set.remove(rev);
                }
            }
            if (!innerList.isEmpty()) {
                newList.add(innerList);                
            }
        }
        return newList;
    }
}
