public class practice9 {
    public static void main(String[] args) {

        int a = calculateScore("Rishi", 1000);
        System.out.println(a);

        int b =calculateScore(500);
        System.out.println(b);

        int c =calculateScore();
        System.out.println(c);
        
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score % 3;
    }
    
    public static int calculateScore(int score) {
        System.out.println("Unknown Player scored " + score + " points.");
        return score % 3;
    }

    public static int calculateScore() {
        System.out.println("Nalla player score nothing");
        return 0;
    }
}

