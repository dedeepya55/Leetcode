import java.util.*;

class Solution {
    public int maxDistance(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int ans = 0;
        
        freq.put('N', 0);
        freq.put('S', 0);
        freq.put('W', 0);
        freq.put('E', 0);
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            
            int up = freq.get('N');
            int down = freq.get('S');
            int left = freq.get('W');
            int right = freq.get('E');
            int k_left = k;
            
            if (up > down) {
                int val = Math.min(k_left, down);
                up += 2 * val;
                k_left -= val;
            } else {
                int val = Math.min(k_left, up);
                down += 2 * val;
                k_left -= val;
            }
            
            if (left > right) {
                int val = Math.min(k_left, right);
                left += 2 * val;
                k_left -= val;
            } else {
                int val = Math.min(k_left, left);
                right += 2 * val;
                k_left -= val;
            }
            
            ans = Math.max(ans, Math.abs(right - left) + Math.abs(up - down));
        }
        return ans;
    }
}