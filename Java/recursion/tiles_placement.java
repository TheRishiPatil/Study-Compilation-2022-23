package recursion;
import java.util.Scanner;

public class tiles_placement {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(tilesPlacement(sc.nextInt(), sc.nextInt()));
    }

    public static int tilesPlacement(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        int horizontal = tilesPlacement(n-1, m);
        int vertical = tilesPlacement(n-m, m);
        return horizontal + vertical;
    }
}