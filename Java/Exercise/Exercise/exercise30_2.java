package Exercise;

public class exercise30_2 {
    public static void main(String[] args) {
    exercise30_1 person = new exercise30_1();
    person.setAge(10);
    System.out.println("Full Name: " + person.getFullName());
    System.out.println("teen : " + person.isTeen());
    person.setFirstName("Rishi");
    person.setAge(18);
    System.out.println("Full Name: " + person.getFullName());
    System.out.println("teen : " + person.isTeen());
    person.setLastName("Pati;");
    System.out.println("Full Name: " + person.getFullName());
    }
}
