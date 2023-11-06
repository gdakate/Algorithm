import java.util.HashSet;
import java.util.Set;

public class leetcode1832 {
    class Solution {
        public boolean checkIfPangram(String sentence) {
            Set<Character> set = new HashSet<>();
            for (char c : sentence.toCharArray()) {
                set.add(c);

            }

            if (set.size() != 26) {
                return false;
            }

            return true;
        }
    }
}
