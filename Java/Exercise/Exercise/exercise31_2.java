package Exercise;

public class exercise31_2 {
    public static void main(String[] args) {
        exercise31_1 wall = new exercise31_1(5,4);
        System.out.println("area: " + wall.getArea());
        
        wall.setHeight(-1.5);
        System.out.println("width: " + wall.getWidth());
        System.out.println("height: " + wall.getHeight());
        System.out.println("area: " + wall.getArea());
    }
}
