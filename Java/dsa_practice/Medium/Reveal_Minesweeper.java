public class Reveal_Minesweeper {

    public static int directions[][] = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 },
            { 1, 1 } };

    public String[][] revealMinesweeper(String[][] board, int row, int column) {
        reccRM(board, row, column);
        return board;
    }

    public void reccRM(String[][] board, int row, int col) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[row].length) {
            return;
        }
        if (board[row][col].equals("M")) {
            board[row][col] = "X";
            return;
        } else if (board[row][col].equals("H")) {
            int nearMines = nearMines(board, row, col);
            if (nearMines != 0) {
                board[row][col] = Integer.toString(nearMines);
                return;
            } else {
                board[row][col] = Integer.toString(0);
                for (int[] direction : directions) {
                    int currRow = direction[0] + row;
                    int currCol = direction[1] + col;
                    reccRM(board, currRow, currCol);
                }
            }
        }
    }

    public static int nearMines(String[][] board, int row, int col) {
        int nearMines = 0;
        for (int[] direction : directions) {
            int currRow = direction[0] + row;
            int currCol = direction[1] + col;
            if (currRow >= 0 && currCol >= 0 && currRow < board.length && currCol < board[currRow].length &&
                    board[currRow][currCol].equals("M")) {
                nearMines++;
            }
        }
        return nearMines;
    }
}
