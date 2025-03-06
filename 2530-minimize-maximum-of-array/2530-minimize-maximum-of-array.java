class Solution {
    public int minimizeArrayValue(int[] nums) {
        long[] ps = new long[nums.length]; 
        ps[0] = nums[0];
        long d = 0;
        int ans = (int) Math.ceil((double) ps[0] / 1);

        for (int i = 1; i < nums.length; i++) {
            ps[i] = ps[i - 1] + nums[i];
            
            if ((ps[i] % (i + 1)) != 0) {
                d = (ps[i] / (i + 1)) + 1; 
            } else {
                d = (ps[i] / (i + 1));
            }

            ans = Math.max(ans, (int) d); 
        }

        return ans;
    }
}
