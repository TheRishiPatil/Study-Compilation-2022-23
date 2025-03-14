import java.util.LinkedList;
import java.util.Queue;

public class Numbers_Of_Islands {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [][] vis = new int[n][m];
        int count = 0;
        for (int row = 0; row < n; row++){
            for (int col = 0; col < m; col++){
                if (vis[row][col] == 0 && grid[row][col] == '1'){
                    count++;
                    bfs(row, col, vis, grid);
                }
            }
        }
        return count;
    }

    public class Pair{
        int first;
        int second;
        public Pair(int f, int s){
            this.first = f;
            this.second = s;
        }
    }

    private void bfs(int row, int col, int[][] vis, char[][] grid){
        vis[row][col] = 1;
        Queue <Pair> list = new LinkedList<>();
        list.add(new Pair(row, col));
        int n = grid.length;
        int m = grid[0].length;

        while (!list.isEmpty()){
            int tempRow = list.peek().first;
            int tempCol = list.peek().second;
            list.remove();

            for (int i = -1; i <= 1; i++){
                for (int j = -1; j <= 1; j++){
                    int deltaRow = i + tempRow;
                    int deltaCol = j + tempCol;
                    if (deltaRow >= 0 && deltaRow < n && deltaCol  >= 0 && deltaCol < m && grid[deltaRow][deltaCol] == '1' && vis[deltaRow][deltaCol] == 0) {
                        vis[deltaRow][deltaCol] = 1;
                        list.add(new Pair(deltaRow, deltaCol));
                    }
                }
            }
        }
    }
}
