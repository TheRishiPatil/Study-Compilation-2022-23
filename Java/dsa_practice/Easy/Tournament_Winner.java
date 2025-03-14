
import java.util.*;

public class Tournament_Winner {
    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap<String, Integer> map = new HashMap<>();
        String FinalWinnerTeam = ""; int finalScore = 0;

        for (int i = 0; i < competitions.size(); i++) {
            int result = results.get(i);
            String roundWinner = competitions.get(i).get(result == 0 ? 1 : 0); 
            int score = map.containsKey(roundWinner) ? map.get(roundWinner) : 0;
            int newScore = score + 3;
            if (newScore > finalScore) {
                finalScore = newScore;
                FinalWinnerTeam = roundWinner;
            }
            map.put(roundWinner, newScore);
        }
        return FinalWinnerTeam;
    }

    public static void main(String[] args) {
        
    }
}
