import java.util.*;

public class leetcode387 {
    class Solution {
        public int firstUniqChar(String s) {
            Map<Character, Integer> map = new LinkedHashMap<>();
            for(char c: s.toCharArray()){
                if(map.containsKey(c))
                    map.put(c,map.get(c)+1);
                else
                    map.put(c,1);
            }
            for(char c : s.toCharArray()){
                if(map.get(c)==1)
                    return s.indexOf(c);
            }
            return -1;
        }
    }
}
