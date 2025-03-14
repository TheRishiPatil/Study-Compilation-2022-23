package Core_Java_Topics;
import java.util.*;

/*
public static void main(String[] args) { ==> calling method
    System.out.println(rishi());
}

public/ private static void rishi()	    or	    static public/ private void rishi()	    or	    static void rishi()    
{ ==> declaration method
    for(value; condition; update){
        if(condition){
            statement;
        }
    }
}
*/

public class Notes {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter number: ");
        int a = sc.nextInt(); // int input
        System.out.println("enter single word string: ");
        String str = sc.next(); // string input

        System.out.println("enter array: ");
        int[] b = new int[a]; // array input
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(b)); // values print in []

        switch (a) { // switch function
            case 0:
                System.out.println("Value is 0");
                break;
            default:
                System.out.println("Value is more than 0");
                break;
        }

        str = str.toLowerCase(); // lowercase the string
        int d = Integer.parseInt(str); // string to int

        float MaxFloatValue = Float.MAX_VALUE; // max value
        double MinDoubleValue = Double.MIN_VALUE; // min value

        if (d == MaxFloatValue || d == MinDoubleValue) { // if else function
            System.out.println("Value is max or min");
        } else {
            System.out.println("Value is not max or min");
        }

        for (int i = 0; i < str.length(); i++) { // compare char of string
            char Ch1 = str.charAt(i);
            char Ch2 = str.charAt(i + 1);
            if (Ch1 == Ch2) {
                i++;
            }
        }

        StringBuilder sb = new StringBuilder(); // use this method to forward char by 1
        for (char c : str.toCharArray()) {
            sb.append(++c); // append add character at the end of the string. new string take separate memory but append directly add characters 
        }
        System.out.println(sb.toString());
        
        String parts[] = str.split(","); // use this method to split string
        for (String part : parts) {
            System.out.println(part);
        }

        double x = 7.131;
        int n = 1;
        double roundOff = Math.round(x * Math.pow(10, n)) / Math.pow(10, n); // round double value after int decimal = 7.1
        System.out.println(roundOff);

        StringBuilder str1 = new StringBuilder("Rishi");
        str1.setCharAt(1, 'u'); // change character
        System.out.println(str);

        str1.insert(0, "par"); // insert string
        System.out.println(str1);

        str1.delete(0, 2); // delete from 0 to 2
        System.out.println(str1);
    }
}