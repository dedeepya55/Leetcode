class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        if (nums.length < k) {
            return 0;
        }

        long c_s = 0;
        long m_s = 0;
        int[] count = new int[1000001]; 
        int uniqueCount = 0;

        for (int i = 0; i < k; i++) {
            c_s += nums[i];
            if (count[nums[i]] == 0) {
                uniqueCount++;
            }
            count[nums[i]]++;
        }

        if (uniqueCount == k) {
            m_s = c_s;
        }

        for (int i = k; i < nums.length; i++) {
            c_s += nums[i] - nums[i - k];
            
            if (count[nums[i]] == 0) {
                uniqueCount++;
            }
            count[nums[i]]++;
            
            if (count[nums[i - k]] == 1) {
                uniqueCount--;
            }
            count[nums[i - k]]--;
            
            if (uniqueCount == k) {
                m_s = Math.max(m_s, c_s);
            }
        }

        return m_s;
    }
}
