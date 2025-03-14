import java.util.Scanner;

public class practice23 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("how many times you want transformation: ");
        int transformation = sc.nextInt();
        System.out.print("Enter a String: ");
        String name = sc.next();
        char[] ch = new char[name.length()];
            for (int i = 0; i < name.length(); i++) {
                ch[i] = name.charAt(i);
                int ascii = ch[i];
                char temp = (char)(ascii + transformation);
                if (ch[i] == 'z') {
                    System.out.print("ab");
                }else{
                    System.out.print(temp);
                }
            }
    }
}
