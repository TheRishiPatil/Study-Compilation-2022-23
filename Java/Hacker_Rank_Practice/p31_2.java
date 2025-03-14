import java.util.Scanner;

public class p31_2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt(); // Questions
        int n = sc.nextInt(); // teams
        int[][] a = new int[x][n];
        int count = 0;
        for (int i = 0; i < x; i++) { // Questions
            for (int j = 0; j < n; j++) { // teams
                a[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < n; j++) { // teams
            count = 0;
            for (int i = 0; i < x; i++) { // questions
                if (a[i][j] == 1) { // a[team] = a[0]
                    count++;
                }
            }
            if (count > Math.ceil(x/2)) { // if count > half of questions
                break;
            }
        }

        if (count > Math.ceil(x/2)) { // if count > half of questions
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
