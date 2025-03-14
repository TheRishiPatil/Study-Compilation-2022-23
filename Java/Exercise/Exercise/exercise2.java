package Exercise;

public class exercise2 {
    public static void main(String[] args) {
        printMegabyetsAndKilobytes(4268);
        printMegabyetsAndKilobytes(2500);
    }


    public static void printMegabyetsAndKilobytes(int kilobytes) {
        int megabytes; int remaining_kilobytes;

        megabytes = kilobytes / 1024;
        remaining_kilobytes = kilobytes % 1024;

        if(kilobytes >= 0){
            System.out.println(kilobytes + " KB = " + megabytes + " MB and " + remaining_kilobytes + " KB");
        } 
        else {
            System.out.println("Invalid Value");
        }       
    }
}
