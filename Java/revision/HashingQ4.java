package revision;
import java.util.HashMap;
//find itinerary (path)
public class HashingQ4 {

    public static HashMap<String, String> revMap(HashMap<String, String> map){
        HashMap<String, String> revMap = new HashMap<>();
        for(String key : map.keySet()){
            revMap.put(map.get(key), key);
        }

        return revMap;
    }

    public static String findKey(HashMap<String, String> map){
        HashMap<String, String> revMap = revMap(map);
        for(String start : map.keySet()){
            if (revMap.containsKey(start) == false) {
                return start;
            }
        }

        return null;
    }

    public static void itinerary(HashMap<String, String> map){
        String start = findKey(map);
        while (map.containsKey(start)) {
            System.out.print(start + " --> ");
            start = map.get(start);
        }
        System.out.print(start);
    }    

    public static void main(String[] arg){
        HashMap<String, String> map = new HashMap<>();
        map.put("Delhi","Goa");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Chennai","Bangaluru");
        map.put("Bangaluru","Panjab");

        itinerary(map);
    }
}