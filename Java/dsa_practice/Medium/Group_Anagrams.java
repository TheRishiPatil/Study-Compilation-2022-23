import java.util.*;

public class Group_Anagrams {

    public static List<List<String>> groupAnagrams(List<String> words) { // my solution
        List<List<String>> list = new ArrayList<>();
        List<String> copyOfWords = new ArrayList<>(words);

        while (!copyOfWords.isEmpty()) {
            String word1 = copyOfWords.get(0);
            List<String> miniList = new ArrayList<>();

            for (String word2 : copyOfWords) {
                if (sorting(word1).equals(sorting(word2))) {
                    miniList.add(word2);
                }
            }

            list.add(miniList);
            copyOfWords.removeAll(miniList);
        }

        return list;
    }

    public static List<List<String>> groupAnagrams2(List<String> words) { // algoexpert solution
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (String word : words) {
            String key = sorting(word);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static String sorting(String word) {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("listen", "silent", "enlist", "word", "hello", "world");
        List<List<String>> groupedAnagrams = groupAnagrams(words);
        System.out.println(groupedAnagrams);
    }
}