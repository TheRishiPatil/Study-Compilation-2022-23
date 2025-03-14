public class practice4 {
    public static void main(String[] args) {

        Calculator(true, 800, 5, 100);
        Calculator(true, 10000, 8, 200);
        Calculator(false, 5000, 10, 100);
        Calculator(false, 2000, 5, 2);

    }

    public static void Calculator(boolean gameOver, int score, int levelcompleted, int bonus) {
        if (gameOver) {
            int finalscore = score + (levelcompleted * bonus);
            finalscore += 1000;
            System.out.println("final score of is " + finalscore); 
        }
        else if (!gameOver){
            int finalscore = score / (levelcompleted * bonus);
            finalscore *= 0; // mastiiiiiiiii :)
            System.out.println("final score of is " + finalscore); 
        }
    }

////////////////////////////////////////////////////////////////////Method 2.0/////////////////////////////////////////////////////////////////////

    public static void main2(String[] args) {

        Calculator1(true, 8100, 6, 500);
        Calculator1(true, 1000, 7, 250);
        Calculator1(false, 4000, 11, 156);
        Calculator1(false, 3000, 6, 215);
    }

    public static int Calculator1(boolean gameOver, int score, int levelcompleted, int bonus) {
        if (gameOver) {
            int finalscore = score + (levelcompleted * bonus);
            finalscore += 1000;
            System.out.println("final score of is " + finalscore); 
            return finalscore;
        }
        return -1;
    }
}
