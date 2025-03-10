import java.util.*;

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        List<Integer> l = new ArrayList<>();
        
        for (int i = 0; i < dist.length; i++) {
            l.add((int) Math.ceil((double) dist[i] / speed[i]));
        }

        Collections.sort(l);
        
        int count = 0;

        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) > i) {
                count++;
            } else {
                break; 
            }
        }
        
        return count;
    }
}
