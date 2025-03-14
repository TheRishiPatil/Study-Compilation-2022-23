package Core_Java_Topics;

public class FloatAndDouble {
    public static void main(String[] args) {
        
        float MinFloatValue = Float.MIN_VALUE;
        float MaxFloatValue = Float.MAX_VALUE;
        double MinDoubleValue = Double.MIN_VALUE;
        double MaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Maximum Float value = " + MaxFloatValue);
        System.out.println("Minimum Float value = " + MinFloatValue);
        System.out.println("Maximum Double value = " + MaxDoubleValue);
        System.out.println("Minimum Double value = " + MinDoubleValue);

        
        int i = 5;
        float j =  5.25f;
        double k = 5.25d;

        System.out.println(("\n my int value is " + i) + ("\n my float value is " + j) + ("\n my double value is " + k));
    }
}
