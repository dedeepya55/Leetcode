class Solution {
    public int longestNiceSubarray(int[] nums) {
        int ans = 0;
        int a = 0; 
        for (int i = 0, j = 0; i < nums.length; i++) {
            // System.out.println(a+"haiiiiii");
            while ((a & nums[i]) > 0) {
                a ^= nums[j++];
                // System.out.println(a+"hai");
            }
            a |= nums[i]; 
            // System.out.println(a+"heelo");
            ans = Math.max(ans, i - j + 1);
            // System.out.println(ans+" "+i+" "+j);
        }
        return ans;
    }
}
