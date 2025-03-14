package Core_Java_Topics;

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "Input is greater than 100";
    }

    @Override
    public String getMessage() {
        return "Please try again";
    }
}

public class basicException {
    public static void number() throws MyException {
        Scanner sc = new Scanner(System.in);
        boolean is = false;
        while (!is) {
            try {
                int i = sc.nextInt();
                if (i < 100) {
                    System.out.println(i);
                    break;
                }
                throw new MyException();

            } catch (Exception e) {
                System.out.println(e);
                System.out.println(e.getMessage());
                e.printStackTrace();
            } finally {
                System.out.println("Thank you!!");
            }
        }
        System.out.println("Finished!");
    }

    public static void main(String[] args) {
        try {
            number();
        } catch (MyException e) {
        }
    }
}