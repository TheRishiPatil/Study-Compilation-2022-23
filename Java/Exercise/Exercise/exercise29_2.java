package Exercise;

public class exercise29_2 {
    public static void main(String[] args) {
        exercise29_1 numbers = new exercise29_1();
        numbers.setFirstNumber(5);
        numbers.setSecondNumber(4);
        System.out.println("first number : " + numbers.getFirstNumber() + ", second number : " + numbers.getSecondNumber() + ", Addition number : " + numbers.getAdditionResult() + ", Substraction number : " + numbers.getSubtractionResult() + ", Multiplication number : " + numbers.getMultiplicationResult() + ", Divisible number : " + numbers.getDivisionResult());
    }
}
