import java.util.*;

public class leetcode349 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            Set<Integer> sets = new HashSet<>();
            for(int i : nums1){
                set.add(i);
            }
            for(int i:nums2){
                if(set.contains(i))
                    sets.add(i);
            }
            int[] arr= new int[sets.size()];
            int index =0;
            for(int i : sets){
                arr[index]=i;
                index++;
            }

            return arr;

        }
    }
}
