public class practice8 {
    public static void main(String[] args) {
        printDayOfTheWeek(8);
        DayOfTheWeekChallenge(5);
    }

    public static void printDayOfTheWeek(int Day) {
        
        switch (Day) {
            case 0:
                System.out.println("Sunday");
            break;
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
            break;
            case 3:
                System.out.println("Wednesday");
            break;
            case 4:
                System.out.println("Thursday");
            break;
            case 5:
                System.out.println("Friday");
            break;
            case 6:
                System.out.println("Saturday");
            break;
        
            default:
                System.out.println("ERROR 404");            
                break;
        }
    }

    public static void DayOfTheWeekChallenge(int Day) {
        
        if (Day == 0) {
            System.out.println("Sunday");
        } 
        else if (Day == 1) 
        {
            System.out.println("Monday");
        }
        else if (Day == 2) 
        {
            System.out.println("Tuesday");
        }
        else if (Day == 3) 
        {
            System.out.println("Wednesday");
        }
        else if (Day == 4) 
        {
            System.out.println("Thursday");
        }
        else if (Day == 5) 
        {
            System.out.println("Friday");    
        }
        else if (Day == 6)
        {
            System.out.println("Saturday");            
        }
        else{
            System.out.println("ERROR 404");                       
        }
    }
    
}
