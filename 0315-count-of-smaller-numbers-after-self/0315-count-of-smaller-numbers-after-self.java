import java.util.*;

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> seen = new ArrayList<>();
        
        for (int i = nums.length - 1; i >= 0; i--) {
            int idx = BinarySearch(seen, nums[i]);
            ans.add(idx);
            seen.add(idx, nums[i]); 
        }
        
        Collections.reverse(ans);
        return ans;
    }

    public int BinarySearch(List<Integer> seen, int target) {
        int low = 0, high = seen.size();
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (seen.get(mid) >= target) {
                high = mid;  
            } else {
                low = mid + 1; 
            }
        }
        return low; 
    }
}
