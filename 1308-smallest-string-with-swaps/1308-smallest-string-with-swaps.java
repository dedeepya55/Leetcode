import java.util.*;

class Solution {
    int[] p;

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i;
        }

        for (int i = 0; i < pairs.size(); i++) {
            int a = pairs.get(i).get(0);
            int b = pairs.get(i).get(1);
            p[find(a)] = find(b);
        }

        Map<Integer, List<Character>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = find(i);
            map.computeIfAbsent(root, k -> new ArrayList<>()).add(s.charAt(i));
        }

        for (List<Character> list : map.values()) {
            Collections.sort(list);
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int root = find(i);
            List<Character> list = map.get(root);
            ans.append(list.remove(0)); 
        }

        return ans.toString();
    }

    private int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]);
        }
        return p[x];
    }
}
