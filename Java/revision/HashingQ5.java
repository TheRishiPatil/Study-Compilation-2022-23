package revision;

import java.util.HashMap;
// subarray sum equal to K.
public class HashingQ5 {
    public static void main(String[] args) {
        int[] arr = {10,2,-2,-20,10};
        int k = -10, ans = 0, sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum + k)) {
                ans += map.get(sum + k);
                // System.out.println("Ans " + (sum + k) + " " + map.get(sum + k));
            }

            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
                // System.out.println("Old " + sum + " " + map.get(sum));
            } else {
                map.put(sum, 1);
                // System.out.println("New " + sum + " " + map.get(sum));
            }
        }
        // System.out.println(map);
        System.out.println(ans);
    }
}
