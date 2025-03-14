package Exercise;

public class exercise28 {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    }  
    
    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBucket) {
        
        if (width <= 0 || height <= 0 || areaPerBucket<= 0 || extraBucket < 0) {
            return -1;
        }
        double total = width * height;
        double areaWeCanPaint = areaPerBucket * extraBucket;
        double value = total - areaWeCanPaint;
        if (value < 0) {
            return 0;
        } else{
            return ((int)Math.ceil(value / areaPerBucket));
        }
    }

}
