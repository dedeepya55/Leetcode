class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int n1:nums)
        {
            s=s|n1;
        }
        return s*(1<<(n-1));
    }
}