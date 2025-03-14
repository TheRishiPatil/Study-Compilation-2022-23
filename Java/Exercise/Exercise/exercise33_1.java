package Exercise;

public class exercise33_1 { // Floor
    private double width;
    private double length;

    public exercise33_1(double width, double length) {
        if (this.length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }

        if (this.width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getArea() {
        return this.width * this.length;
    }

}