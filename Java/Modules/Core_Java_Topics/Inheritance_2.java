package Core_Java_Topics;
// Dog
public class Inheritance_2 extends Inheritance_1{ 
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Inheritance_2(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat){
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    } 
    
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    
}