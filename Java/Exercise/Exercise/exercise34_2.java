package Exercise;

public class exercise34_2 {
    public static void main(String[] args) {
    exercise34_1 one = new exercise34_1(1.0, 1.0);
    exercise34_1 number = new exercise34_1(2.5, -1.5);
    one.add(1,1);
    System.out.println("one.real= " + one.getReal());
    System.out.println("one.imaginary= " + one.getImaginary());
    one.subtract(number);
    System.out.println("one.real= " + one.getReal());
    System.out.println("one.imaginary= " + one.getImaginary());
    number.subtract(one);
    System.out.println("number.real= " + number.getReal());
    System.out.println("number.imaginary= " + number.getImaginary());
    }
}