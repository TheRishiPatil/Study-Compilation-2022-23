import java.util.ArrayList;
import java.util.List;

public class Prduct_Sum {
    public static int productSum(List<Object> array) {
        return sumKrenge(array, 1);
    }

    public static int sumKrenge(List<Object> array, int special) {
        int sum = 0;
        for (Object element : array) {
            sum += element instanceof ArrayList ? sumKrenge((ArrayList<Object>) element, special + 1) : (int) element;
        }
        return sum * special;
    }
}
