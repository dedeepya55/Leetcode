class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxPrefix=0;
        int minPrefix=0;
        int sum=0;
        for(int num:nums){
            sum+=num;
            maxPrefix=Math.max(sum,maxPrefix);
            minPrefix=Math.min(sum,minPrefix);
        }
        return maxPrefix-minPrefix;
    }
}