import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 1) {
            return citations[0] >= 1 ? 1 : 0;
        }
        
        Arrays.sort(citations);
        int left = 0, right = citations.length - 1;
        int max = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int o = citations.length - mid; 
            
            if (citations[mid] >= o) {
                max = o;  
                right = mid - 1;  
            } else {
                left = mid + 1;
            }
        }

        return max;
    }
}
