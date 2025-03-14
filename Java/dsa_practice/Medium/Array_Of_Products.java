public class Array_Of_Products {
    public int[] arrayOfProducts(int[] array) {
        int[] ans = new int[array.length];
        for (int i = 0; i < ans.length; i++) {
            int total = 1;
            if (i > 0) {
                int left = i-1;
                while (left >= 0) {
                    total *= array[left];
                    left--;
                } 
            }
            if (i < ans.length - 1) {
                int right = i + 1;
                while (right <= ans.length - 1) {
                    total *= array[right];
                    right++;
                }
            }
            ans[i] = total;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(5);
    }
}
