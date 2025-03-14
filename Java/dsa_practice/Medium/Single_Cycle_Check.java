public class Single_Cycle_Check {

    public static boolean hasSingleCycle(int[] array) {
        boolean vis[] = new boolean[array.length];
        int i = 0;
        int count = 0;
        while (count < array.length) {
            if (vis[i]) {
                return false;
            }
            vis[i] = true;
            count++;
            i = (i + array[i]) % array.length;
            if (i < 0) {
                i += array.length;
            }
        }
        return i == 0;
    }

    public static void main(String[] args) {
        int array[] = {1, 1, 0, 1, 1};

        System.out.println(hasSingleCycle(array));
    }
}
