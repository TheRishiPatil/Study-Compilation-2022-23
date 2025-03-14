package Core_Java_Topics;

public class ByteAndShortAndIntAndLong {
    
    public static void main(String[] args) {
        int intMaxValue = Integer.MAX_VALUE;
        int intMinValue = Integer.MIN_VALUE;
        System.out.println("Minimum int value = " + intMinValue);
        System.out.println("Maximum int value = " + intMaxValue);
        System.out.println("Busterd minimum int value = " + (intMinValue - 1));
        System.out.println("Busterd maximum int value = " + (intMaxValue + 1));
        System.out.println("\n");

        byte byteMaxValue = Byte.MAX_VALUE;
        byte byteMinValue = Byte.MIN_VALUE;
        System.out.println("Maximum byte value = " + byteMaxValue);
        System.out.println("Minimum byte value = " + byteMinValue);
        System.out.println("\n");
    
        short shortMaxValue = Short.MAX_VALUE;
        short shortMinValue = Short.MIN_VALUE;
        System.out.println("Maximum short value = " + shortMaxValue);
        System.out.println("Minimum short value = " + shortMinValue);
        System.out.println("\n");

        long longMaxValue = Long.MAX_VALUE;
        long longMinValue = Long.MIN_VALUE;
        System.out.println("Maximum long value = " + longMaxValue);
        System.out.println("Minimum long value = " + longMinValue);
        System.out.println("\n");

    }
}