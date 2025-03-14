public class Search_In_Sorted_Matrix {
    public static int[] searchInSortedMatrix(int[][] matrix, int target) { // my solution using recursion
        int[] ans = { -1, -1 };
        search(matrix, target, ans, matrix.length - 1, 0);
        return ans;
    }

    public static int[] search(int[][] matrix, int target, int[] ans, int i, int j) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            return ans;
        }
        if (matrix[i][j] == target) {
            ans[0] = i;
            ans[1] = j;
            return ans;
        } else if (matrix[i][j] < target) {
            return search(matrix, target, ans, i, j + 1);
        } else {
            return search(matrix, target, ans, i - 1, j);
        }
    }

    public static int[] searchInSortedMatrix1(int[][] matrix, int target) { // algoexpert solution using while loop
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] == target) {
                return new int[] {i, j};
            }

            if (matrix[i][j] < target) {
                j++;
            } else {
                i--;
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 4, 7, 11 },
                { 2, 5, 8, 12 },
                { 3, 6, 9, 16 },
                { 10, 13, 14, 17 }
        };

        int ans[] = searchInSortedMatrix(matrix, 18);
        for (int i = 0; i < ans.length - 1; i++) {
            System.out.print(ans[i] + ", ");
        }
        System.out.println(ans[ans.length-1]);
    }

}
