package revision;

import java.util.HashSet;
//find intersection
public class HashingQ3 {
    public static int intersection(HashSet<Integer> set, int[] arr2){
        int count = 0;
        for(int i = 0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                System.out.println(arr2[i]);
                set.remove(arr2[i]);
            }
        }

        return count;
    }

    public static void main(String[] arg){
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        System.out.print(intersection(set, arr2));
    }
}
