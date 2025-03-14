import java.util.ArrayList;
import java.util.List;

public class Spiral_Traverse {
    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> list = new ArrayList<>();
        int start2 = 0, start1 = 0, endrow = array.length - 1, endcol = array[0].length - 1;
        while (start2 <= endrow && start1 <= endcol) {
            for(int i = start1; i <= endcol; i++){
                list.add(array[start2][i]);
            }
            for(int i = start2 + 1; i <= endrow; i++){
                list.add(array[i][endcol]);
            }
            for (int i = endcol - 1; i >= start1; i--) {
                if (start2 == endrow) {
                    break;
                }
                list.add(array[endrow][i]);
            }
            for(int i = endrow - 1; i > start2; i--){
                if (start1 == endcol) {
                    break;
                }
                list.add(array[i][start1]);
            }

            start1++;
            start2++;
            endcol--;
            endrow--;
        }
        return list;
    }
}
