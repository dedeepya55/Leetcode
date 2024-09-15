public class Solution {
    public int findTheLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int mask = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int end = 0; end < n; end++) {
            char c = s.charAt(end);
            if (c == 'a') mask ^= 1;
            if (c == 'e') mask ^= 2;
            if (c == 'i') mask ^= 4;
            if (c == 'o') mask ^= 8;
            if (c == 'u') mask ^= 16;

            if (map.containsKey(mask)) {
                maxLen = Math.max(maxLen, end - map.get(mask));
            } else {
                map.put(mask, end);
            }
        }
        return maxLen;
    }
}