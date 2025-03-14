package Core_Java_Topics;
public class string {
    public static void main(String[] args) {
        String i = "\nMy name is ";
        String j = i + "Rishi Krishna Patil AKA ";
        
        String a = "22/01/200";
        int b = 01;
        int c = 01;
        a = a + (b + c);
        
        j = j + "Patil \u0044 Joker. Born in " + a + "\n";
        System.out.println(j);
    }
}
