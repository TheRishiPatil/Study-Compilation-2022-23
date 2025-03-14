public class Staircase_Traversal {
    public int staircaseTraversal(int height, int maxSteps) {
        return calculation(height, maxSteps, 0);
    }

    public static int calculation(int height, int maxSteps, int ways) {
        if (height == 0) {
            return ++ways;
        } else {
            for (int i = 1; i <= maxSteps; i++) {
                if (height-i >= 0) {
                    ways = calculation(height - i, maxSteps, ways);
                    System.out.println(height - i + ", " + maxSteps + ", " + ways);
                }
            }
        }
        return ways;
    }

    public static void main(String[] args) {
        int height = 3;
        int maxSteps = 2;
        System.out.println(calculation(height, maxSteps, 0));
    }
}
