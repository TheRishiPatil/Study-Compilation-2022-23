package Exercise;

public class exercise34_1 {
    private double real;
    private double imaginary;

    public exercise34_1(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(exercise34_1 number) {
        this.real += number.real;
        this.imaginary += number.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(exercise34_1 number) {
        this.real -= number.real;
        this.imaginary -= number.imaginary;
    }
}