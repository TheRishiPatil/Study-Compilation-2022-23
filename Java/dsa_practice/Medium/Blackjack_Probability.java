import java.util.HashMap;

public class Blackjack_Probability {
    public static float blackjackProbability(int target, int startingHand) {
        HashMap<Integer, Float> map = new HashMap<>();
        return  Math.round(calculation(target, startingHand, map) * 1000f) / 1000f;
    }

    public static float calculation(int target, int currHand, HashMap<Integer, Float> map) {
        if (map.containsKey(currHand)) return map.get(currHand);
        if(currHand > target) return 1;
        if(currHand + 4 >= target) return 0;

        float currResult = 0; 
        for (int i = 1; i <= 10; i++) {
            currResult += calculation(target, currHand + i, map) * .1;
        }  

        map.put(currHand, currResult);
        return currResult;
    }

    public static void main(String[] args) {
        int target = 1;
        int startingHand = 10;

        System.out.println(blackjackProbability(target, startingHand));
    }
}
