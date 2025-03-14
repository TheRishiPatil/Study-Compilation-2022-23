public class practice6 {
    public static void main(String[] args) {
        
        calcFeetAndInchesToCentimeters(4, 5);
        calcFeetAndInchesToCentimeters(150);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) 
        {
            double newfeet = (feet * 30.48);
            double newinches = (inches * 2.54);
            double centimeter = newfeet + newinches;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeter + " cm.");
            return centimeter;
        } 
        else 
        {
            System.out.println("invalid value");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) 
        {
            double feet = (int) inches / 12; // value = 12
            double remaininginches = (int) inches % 12; // value = 6
            System.out.println(inches + "inches = " + feet + " feet and " + remaininginches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remaininginches);
        }
        return -1;
    }
}
