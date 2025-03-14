public class practice5 {
    public static void main(String[] args) {

       int highScore =  calculateHighScorePosition(1500);
       displayHighScorePosition("Rishi", highScore);

       highScore =  calculateHighScorePosition(900);
       displayHighScorePosition("Joker", highScore);

       highScore =  calculateHighScorePosition(400);
       displayHighScorePosition("ME", highScore);
       
       highScore =  calculateHighScorePosition(50);
       displayHighScorePosition("Myself", highScore);

       highScore =  calculateHighScorePosition(500);
       displayHighScorePosition("Lol", highScore);
    }

    public static void  displayHighScorePosition(String name, int highScore) {
        System.out.println(name + " managed to get into position " + highScore + " on the high score table");
    }

    public static int calculateHighScorePosition(int Score) {
        if (Score >= 1000) {
            return 1;
        } else if (Score >= 500 && Score < 1000) {
            return 2;
        } else if (Score >= 100 && Score < 500) {
            return 3;
        }
        return 4;
    }
}
