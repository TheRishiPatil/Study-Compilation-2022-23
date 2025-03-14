import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phone_Number_Mnemonics {
    static Map<Character, String> map = new HashMap<>() {
        {
            put('0', "0");
            put('1', "1");
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };

    public static ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
        ArrayList<String> result = new ArrayList<>();
        backTracking(phoneNumber, 0, "", result);
        return result;
    }

    public static void backTracking(String number, int index, String currStr, ArrayList<String> result) {
        if (currStr.length() == number.length()) {
            result.add(currStr);
            return;
        }
        char currChar = number.charAt(index);
        for (char ch : map.get(currChar).toCharArray()) {
            backTracking(number, index + 1, currStr + "" + ch, result);
        }
    }
    public static void main(String[] args) {
        String phoneNumber = "230";
        ArrayList<String> result = phoneNumberMnemonics(phoneNumber);
        for (String str : result) {
            System.out.println(str);
        }
    }
}
