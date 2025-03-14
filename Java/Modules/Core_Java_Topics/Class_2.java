package Core_Java_Topics;

public class Class_2 {

    public static void main(String[] args) {
        Class_1 Column1 = new Class_1();
        Class_1 Column2 = new Class_1();
        Column1.setModel("Rishi");
        Column2.setModel("Joker");
        System.out.println("My name is " + Column1.getModel() + " AKA " + Column2.getModel());   
    }
}
