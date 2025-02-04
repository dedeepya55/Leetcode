import java.util.*;

class Solution {
    public boolean canCross(int[] stones) {
        if (stones[1] - stones[0] != 1) return false;

        Map<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int stone : stones) {
            map.put(stone, new HashSet<>());
        }
        map.get(0).add(1); 

        for (int stone : stones) {
            for (int step : map.get(stone)) {
                int reach = stone + step;
                if (reach == stones[stones.length - 1]) return true; 
                if (map.containsKey(reach)) {
                    if (step - 1 > 0) map.get(reach).add(step - 1);
                    map.get(reach).add(step);
                    map.get(reach).add(step + 1);
                }
            }
        }
        //   for (Map.Entry<Integer, HashSet<Integer>> ele : map.entrySet()) {
        //     Set<Integer> l = ele.getValue();
        //     System.out.print(ele.getKey()+" ");
        //     for (int i : l) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
        return false;
    }
}
