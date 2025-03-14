package Core_Java_Topics;
public class while_and_do_while_statement {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
        System.out.println("Count is " + count++);
        }
        count = 1;
        do {
        System.out.println("Count is " + count++);
        } while (count != 6);
    }
}
