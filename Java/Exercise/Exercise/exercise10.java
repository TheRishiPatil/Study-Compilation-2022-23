package Exercise;

public class exercise10 {
    public static void main(String[] args) {
        printEqual(1,1,1);
    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        }
        else if (a == b && b == c && c== a) {
            System.out.println("All numbers are equal");
        }
        else if (a != b && b != c && c!= a) {
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neigther all are equal or different");
        }
    }
}
