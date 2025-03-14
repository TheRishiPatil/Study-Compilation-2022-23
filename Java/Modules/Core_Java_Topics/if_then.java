package Core_Java_Topics;

public class if_then {
    public static void main(String[] args) {
        int Marks = 50;
        if ((Marks >= 80) && (Marks <= 90)) {
            System.out.println("god or what");
        }
        if ((Marks <= 80) || (Marks >= 60)) {
            System.out.println("piro player");            
        }
        if (Marks <= 60) {
            System.out.println("kya topper banega re tu");                     
        }

        boolean hehe = false;
        if (!hehe) {
            System.out.println("god or what");
        }

        boolean yoho = hehe ? true : false;
        if (yoho) {
            System.out.println("kya topper banega re tu");                     
        }
    }
}
