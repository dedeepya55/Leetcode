class Solution {
    public int[] dp;
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return hoo(n);
    }
    public int hoo(int n){
         dp[0]=0;
        dp[1]=1;
        dp[2]=1;
         if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=hoo(n-1)+hoo(n-2)+hoo(n-3);
        return dp[n];
    }
}