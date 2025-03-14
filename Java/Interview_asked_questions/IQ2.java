package Interview_asked_questions;

public class IQ2 {
    public static void main(String[] args) {
        // add String without + sign
        String str1 = "Hello";
        String str2 = str1.concat(" World");
        System.out.println(str2);

        // change string values
        StringBuffer str3 = new StringBuffer("Rishikesh");
        str3.setCharAt(0, 'r');
        System.out.println(str3);
    }


}