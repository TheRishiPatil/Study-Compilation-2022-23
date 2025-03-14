package topics;

import java.util.*;


public class hashMap {
    public static void main(String arg[]){
        // HashMap<country(key), population(value)>
        HashMap<String, Integer> map = new HashMap<>();
        // Scanner sc = new Scanner(System.in);

        // Insert
        map.put("India", 120);
        map.put("China", 150);
        map.put("US", 30);

        map.put("China", 180); // <-- if the key is alreaady present then it'll update the value.

        // Search
        // String s = sc.next();
        // if (map.containsKey(s)) {
        //     System.out.println(s + "'s population: " + map.get(s));
        // } else{
        //     System.out.print("Please put " + s + "'s population: ");
        //     map.put(s, sc.nextInt());
        // }

        // Iterator 1
        // for(Map.Entry<String, Integer> list : map.entrySet()){
        //     System.out.println(list.getKey() + ": " + list.getValue());
        // }
        // System.out.println();
        
        
        // // remoove
        // map.remove("China");

        // Iterator 2
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
