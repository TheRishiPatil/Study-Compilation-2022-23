import java.util.Arrays;

public class Number_Of_Ways_To_Make_Changes {
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] ways = new int[n + 1];
        Arrays.fill(ways, 0);
        ways[0] = 1;
        for (int demon: denoms){
            for (int i = 1; i < ways.length; i++) {
                if (demon <= i) {
                    ways[i] += ways[i - demon];
                }
            }
        }
        return ways[n];
    }

    public static void main(String[] args) {
        int arr[] = {1, 10, 5, 25};
        int target = 25;
        System.out.println(numberOfWaysToMakeChange(target, arr));
    }
}
