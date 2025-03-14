package Exercise;

public class exercise32_2 {
    public static void main(String[] args) {

        exercise32_1 firstPoint = new exercise32_1(6, 5);
        exercise32_1 secondPoint = new exercise32_1(3, 1);

        System.out.println("distance(0,0) = " + firstPoint.distance());
        System.out.println("distance(second) = " + firstPoint.distance(secondPoint));
        System.out.println("distance(2,2) = " + firstPoint.distance(2,2));

        exercise32_1 thirdPoint = new exercise32_1();

        System.out.println("distance() = " + thirdPoint.distance());
    }
}
