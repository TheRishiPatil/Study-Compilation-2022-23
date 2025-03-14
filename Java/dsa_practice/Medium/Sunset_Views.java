import java.util.ArrayList;
import java.util.Arrays;
// building can see sunset if its taller than before
public class Sunset_Views {
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        ArrayList<Integer> ans = new ArrayList<>();
        int tall = 0;
        if (buildings.length == 0) {
                return ans;
        }
        if (direction.equals("EAST")) {
            for (int i = buildings.length - 1; i >= 0; i--) {
                if (buildings[i] > tall) {
                    ans.add(0, i);
                    tall = buildings[i];
                }
            }
          
        } else {
            for (int i = 0; i < buildings.length; i++) {
                if (buildings[i] > tall) {
                    ans.add(i);
                    tall = buildings[i];
                }
            }
        }
        return ans;
    }

    // west direction -->
    // east direction <--
    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        String direction = "WEST";
        ArrayList<Integer> ans = sunsetViews(buildings, direction);
        System.out.println(ans);
    }
}