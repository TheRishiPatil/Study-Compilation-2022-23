public class Remove_Islands {
    public int[][] removeIslands(int[][] matrix) {

        for (int i = 0; i < matrix[0].length; i++) {
            visit(0, i, matrix);
            visit(matrix.length - 1, i, matrix);
        }
        for (int i = 0; i < matrix.length; i++) {
            visit(i, 0, matrix);
            visit(i, matrix[0].length - 1, matrix);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = matrix[i][j] == 2 ? 1 : 0;
            }
        }

        return matrix;
    }

    public static void visit(int i, int j, int[][] matrix) {
        if (i < 0 || j < 0 || i == matrix.length || j == matrix[0].length || matrix[i][j] != 1) {
            return;
        }

        matrix[i][j] = 2;

        visit(i - 1, j, matrix);
        visit(i + 1, j, matrix);
        visit(i, j - 1, matrix);
        visit(i, j + 1, matrix);
    }
}