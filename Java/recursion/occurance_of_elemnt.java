package recursion;
import java.util.Scanner;

public class occurance_of_elemnt {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.next();
        char character = sc.next().charAt(0);
        occuranceOfElemnt(str, str.length() - 1, character);
    }

    static int first = Integer.MAX_VALUE;
    static int last = 0;;
    public static void occuranceOfElemnt(String str, int index, char character) {
        if (str.charAt(index) == character) {
            if (index > last) {
                last = index;
            }
            if (index < first) {
                first = index;
            }
        }
        if (index == 0) {
            System.out.println("First occurance of an element is "+ first + " and last occurance of an element is " + last);
            return;
        }
        occuranceOfElemnt(str, index - 1, character);
    }
    
}
