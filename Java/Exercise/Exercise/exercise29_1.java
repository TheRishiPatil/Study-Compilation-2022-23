package Exercise;

public class exercise29_1 {
    private double firstnumber;
    private double secondnumber;

    public double getFirstNumber() {
        return this.firstnumber;
    }

    public double getSecondNumber() {
        return this.secondnumber;
    }

    public void setFirstNumber(double firstnumber) {
        this.firstnumber = firstnumber;
    }

    public void setSecondNumber(double secondnumber) {
        this.secondnumber = secondnumber;
    }

    public double getAdditionResult() {
        return firstnumber + secondnumber;
    }

    public double getSubtractionResult() {
        return firstnumber - secondnumber;
    }

    public double getMultiplicationResult() {
        return firstnumber * secondnumber;
    }

    public double getDivisionResult() {
        if (secondnumber == 0) {
            return 0;
        }
        return firstnumber / secondnumber;
    }
}
