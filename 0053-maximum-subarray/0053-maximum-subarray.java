class Solution {
    public int maxSubArray(int[] nums) {
        int d=Integer.MIN_VALUE;
         int s=0;
        for(int i=0;i<nums.length;i++)
        {
               s=s+nums[i];
                d=Math.max(d,s);
                if(s<0)
                {
                    s=0;
                }
        }
        return d;
    }
}