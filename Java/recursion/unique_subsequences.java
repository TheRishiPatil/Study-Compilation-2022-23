package recursion;
import java.util.HashSet;
import java.util.Scanner;

public class unique_subsequences {
    public static Scanner sc = new Scanner(System.in);

    public static void printSubseq(String str, int index, String newString, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            }
            set.add(newString);
            System.out.println(newString);
            return;
        }

        // choose
        printSubseq(str, index + 1, newString + str.charAt(index), set);
        // don't choose
        printSubseq(str, index + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = sc.next();
        HashSet<String> set = new HashSet<>();
        printSubseq(str, 0, "", set);
    }

}
