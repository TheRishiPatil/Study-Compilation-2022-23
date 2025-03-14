package Exercise;

public class exercise31_1 {
    private double width;
    private double height;

    public exercise31_1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public exercise31_1() {
        this(00, 00);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        if (this.width < 0) {
            this.width = 0;
        }
        this.width = width;
    }
    
    public double getHeight() {
        if (this.height < 0) {
            this.height = 0;
        }
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * height;
    }
}
