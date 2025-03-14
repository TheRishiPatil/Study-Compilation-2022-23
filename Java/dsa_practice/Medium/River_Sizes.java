import java.util.ArrayList;
import java.util.List;

public class River_Sizes {

    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> sizes = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    sizes.add(getSizes(i, j, matrix, 0));
                }
            }
        }

        return sizes;
    }

    public static int getSizes(int i, int j, int[][] matrix, int size) {
        if (i < 0 || j < 0 || i == matrix.length || j == matrix[0].length) {
            return 0;
        }
        if (matrix[i][j] == 0) {
            return 0;
        }

        matrix[i][j] = 0;

        int left = getSizes(i, j - 1, matrix, size);
        int right = getSizes(i, j + 1, matrix, size);
        int top = getSizes(i - 1, j, matrix, size);
        int bottom = getSizes(i + 1, j, matrix, size);

        return left + right + top + bottom + 1;
    }
}
