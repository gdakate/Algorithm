import java.util.*;

public class leetcode350 {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map1 = new HashMap<>();
            ArrayList <Integer> list = new ArrayList<>();

            for(int i : nums1){
                map1.put(i,map1.getOrDefault(i,0)+1);
            }

            for(int i : nums2){
                if(map1.get(i)!=null && map1.get(i)>0){
                    list.add(i);
                    map1.put(i,map1.get(i)-1);
                }
            }

            int[] arr = new int[list.size()];
            for(int i =0;i<list.size();i++){
                arr[i]=list.get(i);
            }
            return arr;




        }
    }
}
