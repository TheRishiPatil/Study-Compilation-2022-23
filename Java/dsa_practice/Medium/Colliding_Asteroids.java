import java.util.Stack;

public class Colliding_Asteroids {
    public static int[] collidingAsteroids(int[] asteroids) {
        Stack<Integer> list = new Stack<>();
        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                list.push(asteroid);
            } else {
                while (list.size() > 0 && list.peek() < -asteroid && list.peek() > 0) {
                    list.pop();
                }
                if (list.size() > 0 && list.peek() > -asteroid) { }
                else if (list.size() > 0 && list.peek() == -asteroid) {
                    list.pop();
                } else {
                    list.push(asteroid);
                }
            }
        }
        int[] ans = new int[list.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = list.pop();
            System.out.println(ans[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] asteroids = {-3, 7, -8, 6, 7, -5, -7};
        collidingAsteroids(asteroids);
    }
}
