public class Valid_Starting_City {
    public static int validStartingCity(int[] distances, int[] fuel, int mpg) {
        int idx = 0, ans = 0;
        for (int i = 0; i < distances.length; i++) {
            ans += (mpg * fuel[i]) - distances[i];
            System.out.println(ans + " : " + idx);
            
            if (ans < 0) {
                idx = i + 1;
                ans = 0;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] distances = {5, 25, 15, 10, 15};
        int[] fuel = {1, 2, 1, 0, 3};
        int mpg = 10;

        validStartingCity(distances, fuel, mpg);
    }
}
