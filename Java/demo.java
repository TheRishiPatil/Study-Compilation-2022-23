import java.util.*;

class demo {
    public static void main(String[] args) {
        int A[][] = new ArrayList<>(Arrays.asList(Arrays.asList(1, 2)), Arrays.asList(3, 4));
        downwardDiagonal(A);
    }

    static ArrayList<Integer> downwardDiagonal(int A[][]) {
        int row = 0, col = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (col < A[0].length) {
            int tempRow = row, tempCol = col;
            while (tempCol >= 0 && tempRow < A.length) {
                list.add(A[tempRow][tempCol]);
                System.out.println(A[tempRow][tempCol]);
                tempRow++; tempCol--;
            }
        }

        return list;
    }
}