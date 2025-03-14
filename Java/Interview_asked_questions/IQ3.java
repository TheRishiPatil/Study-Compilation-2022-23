package Interview_asked_questions;

import java.util.Scanner;

public class IQ3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = new String("Rishikesh Krishna Patil");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.print(str.substring(start, end));
    }
}
