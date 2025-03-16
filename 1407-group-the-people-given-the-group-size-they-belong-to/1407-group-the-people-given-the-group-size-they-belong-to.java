import java.util.*;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> m = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            m.putIfAbsent(size, new ArrayList<>());
            m.get(size).add(i);
        }
        for (Map.Entry<Integer, List<Integer>> entry : m.entrySet()) {
            int groupSize = entry.getKey();
            List<Integer> people = entry.getValue();

            for (int i = 0; i < people.size(); i += groupSize) {
                ans.add(people.subList(i, i + groupSize));
            }
        }
        
        return ans;
    }
}
