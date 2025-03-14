public class Number_Of_Ways_To_Traverse_Graph {
    public static int numberOfWaysToTraverseGraph(int width, int height) {
        int ans[][] = new int[height][width];
        for (int i = 0; i < height; i++) {
            ans[i][0] = 1;
        }
        for (int i = 0; i < width; i++) {
            ans[0][i] = 1;
        }

        for (int i = 1; i < height; i++) {
            for (int j = 1; j < width; j++) {
                int left = ans[i][j - 1];
                int up = ans[i - 1][j];
                ans[i][j] = left + up;
            }
        }
        return ans[height - 1][width - 1];
    }

    

    public static void main(String[] args) {
        int width = 4;
        int height = 3;
        System.out.println(numberOfWaysToTraverseGraph(height, width));
        
    }
}
