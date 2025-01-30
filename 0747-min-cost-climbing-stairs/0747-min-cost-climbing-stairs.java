class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        dp[cost.length]=0;
         dp[cost.length - 1] = cost[cost.length - 1];
        int ans=Integer.MAX_VALUE;
            for(int i=cost.length-2;i>=0;i--){
                dp[i]=cost[i]+Math.min(dp[i+1],dp[i+2]);
            }
            ans=Math.min(dp[0],dp[1]);
        return ans;
    }
}