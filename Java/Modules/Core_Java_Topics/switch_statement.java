package Core_Java_Topics;
public class switch_statement {
    public static void main(String[] args) {
        char switch_value = 'R';
        switch (switch_value) {
            case 'A':
                System.out.println("Word is A, HEHEHEHEH!!!");
            break;
            case 'B':
                System.out.println("Word is B, HEHEHEHEH!!!");
            break;
            case 'C':
                System.out.println("Word is C, HEHEHEHEH!!!");
            break;
            case 'D':
                System.out.println("Word is D, HEHEHEHEH!!!");
            break;
            case 'E':
                System.out.println("Word is E, HEHEHEHEH!!!");
            break;
         
            default:
                System.out.println("Word is not A, B, C, D or E");
            break;
        }

        String Month = "MaY";
        switch (Month.toLowerCase()) {
            case "january":
                System.out.println("Congrats!! Its January :)");
            break;
            case "february":
                System.out.println("Congrats!! Its February :)");
            break;
            case "march":
                System.out.println("Congrats!! Its March :)");
            break;
            case "april":
                System.out.println("Congrats!! Its April :)");
            break;
            case "may":
                System.out.println("Congrats!! Its May :)");
            break;
            case "june":
                System.out.println("Congrats!! Its June :)");
            break;
            case "july":
                System.out.println("Congrats!! Its July :)");
            break;
            case "august":
                System.out.println("Congrats!! Its August :)");
            break;
            case "september":
                System.out.println("Congrats!! Its September :)");
            break;
            case "october":
                System.out.println("Congrats!! Its October :)");
            break;
            case "november":
                System.out.println("Congrats!! Its November :)");
            break;
            case "december":
                System.out.println("Congrats!! Its December :)");
            break;
        
            default:
                System.out.println("Sed Life :/ The END");
            break;
        }
    }
}
