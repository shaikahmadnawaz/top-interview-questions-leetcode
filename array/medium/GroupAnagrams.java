package array.medium;

import java.util.*;

public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
    for (String word : strs) {
      char[] ch = word.toCharArray();
      Arrays.sort(ch);
      String newWord = new String(ch);
      if (!map.containsKey(newWord)) {
        map.put(newWord, new ArrayList<>());
      }
      map.get(newWord).add(word);
    }
    return new ArrayList<>(map.values());
  }
}
