package Core_Java_Topics.Thread;

public class Question1 {

    public static int method(){
        int a = 5, b = 5;
        try {
            int c = a + b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("This is important message!");
        }
        return -1;
    }
    public static void main(String[] args) throws Exception{
        System.out.println(method());
    }
}
