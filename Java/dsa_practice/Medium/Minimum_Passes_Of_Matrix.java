import java.util.LinkedList;
import java.util.Queue;

public class Minimum_Passes_Of_Matrix {

    public int minimumPassesOfMatrix(int[][] matrix) {
        Queue<int[]> list = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > 0) {
                    list.add(new int[]{i, j});
                }
            }
        }

        int directions[][] = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int count = 0;
        
        while (!list.isEmpty()) {
            boolean isAbleToChange = false;
            int size = list.size();

            for (int i = 0; i < size; i++) {
                int[] curr = list.poll();

                for (int[] direction : directions) {
                    int row = curr[0] + direction[0];
                    int col = curr[1] + direction[1];

                    if (row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length || matrix[row][col] >= 0) {
                        continue;
                    }

                    matrix[row][col] *= -1;
                    list.add(new int[] {row, col});
                    isAbleToChange = true;
                }
            }
            if (isAbleToChange) {
                count++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < 0) {
                    return -1;
                }
            }
        }
        return count;
    }
}
