import java.util.*;

public class Class_Photos {
    public static boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        int i = 0;
        if (redShirtHeights.get(i) > blueShirtHeights.get(i)) {
            while (i < redShirtHeights.size()) {
                if (redShirtHeights.get(i) <= blueShirtHeights.get(i)) {
                    return false;
                }
                i++;
            }
        } else{
            while (i < redShirtHeights.size()) {
                if (redShirtHeights.get(i) >= blueShirtHeights.get(i)) {
                    return false;
                }
                i++;
            }
        }
        return true;
  }
    public static void main(String[] args) {
        ArrayList<Integer> redShirtHeights = new ArrayList<>(Arrays.asList(5, 6, 7, 2, 3, 1, 2, 3));
        ArrayList<Integer> blueShirtHeights = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1));
        System.out.println(classPhotos(redShirtHeights, blueShirtHeights));
    }
}
