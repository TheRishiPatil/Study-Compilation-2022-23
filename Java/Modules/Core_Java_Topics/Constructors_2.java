package Core_Java_Topics;

public class Constructors_2 {
    public static void main(String[] args) {
        Constructors_1 MyConstructor = new Constructors_1("Rishi", "Krishna", "Patil");
        System.out.println(MyConstructor.getColumn1() + (" ") + MyConstructor.getColumn2() + (" ") + MyConstructor.getColumn3()); // <-- Constructor. stores more than one values.
    
        Constructors_1 MyConstructor1 = new Constructors_1();
        System.out.println(MyConstructor1.getColumn1() + MyConstructor1.getColumn2() + MyConstructor1.getColumn3()); // <-- Printed Default Value
    }
}
