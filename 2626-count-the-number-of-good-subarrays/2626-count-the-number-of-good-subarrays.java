class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        long pairs = 0;
        long ans = 0;
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            int currFreq = freq.getOrDefault(nums[r], 0);
            // System.out.println(currFreq+" "+nums[r]);
            pairs += currFreq;
            freq.put(nums[r], currFreq + 1);
            while (pairs >= k) {
                ans += nums.length - r; 
                int leftFreq = freq.get(nums[l]);
                freq.put(nums[l], leftFreq - 1);
                pairs -= (leftFreq - 1);
                l++;
            }
        }

        return ans;
    }
}
