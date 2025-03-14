package recursion;

import java.util.ArrayList;

public class natural_no_subset {
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> subset = new ArrayList<>();    
        findSubset(n, subset);
        System.out.println(count);
    }
    
    static int count = 0;

    public static void findSubset(int n, ArrayList<Integer> subset){
        if (n == 0) {
            printSubset(subset);
            count++;
            return;
        }
        subset.add(n);
        findSubset(n-1, subset);
        
        subset.remove(subset.size() - 1);
        findSubset(n-1, subset);
    }

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
}
