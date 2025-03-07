class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int coin:coins){
                if(coin<=i){
                     dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        // for(int i=0;i<dp.length;i++){
        //     System.out.println(dp[i]);
        // }
        if(dp[amount]!=amount+1){
            return dp[amount];
        }
        return -1;
    }
}