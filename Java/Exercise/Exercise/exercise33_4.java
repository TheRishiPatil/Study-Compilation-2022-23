package Exercise;

public class exercise33_4 {  
    public static void main(String[] args) {
        exercise33_2 carpet = new exercise33_2(3.5);
        exercise33_1 floor = new exercise33_1(2.75, 4.0);
        exercise33_3 calculator = new exercise33_3(floor, carpet);

        System.out.println("Total cost = " + calculator.getTotalCost());

        carpet = new exercise33_2(1.5);
        floor = new exercise33_1(5.4, 4.5);
        calculator = new exercise33_3(floor, carpet);

        System.out.println("Total cost = " + calculator.getTotalCost());
    }
}