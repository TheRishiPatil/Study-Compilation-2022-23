package Exercise;

public class exercise8 {
    public static void main(String[] args) {
        System.out.println(area(1,4));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        double Pi = 3.14;
        double areaOfCircle = radius * radius * Pi;
        return areaOfCircle;
    }

    public static double area(double x, double y) {
        if (x < 0 ||  y < 0) {
            return -1;
        }
        else{
            double areaOfRectangle = x * y;
            return areaOfRectangle;
        }

    }

}
