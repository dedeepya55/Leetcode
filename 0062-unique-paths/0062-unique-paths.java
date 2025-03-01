class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        int nums=CountWays(0,0,m,n,dp);
        if(m==1 && n==1){
            return nums;
        }
        return dp[0][0];
    }
    public int CountWays(int i,int j,int m,int n,int[][] dp){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || j>=n){
            return 0;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        dp[i][j]=CountWays(i+1,j,m,n,dp)+CountWays(i,j+1,m,n,dp);
        return dp[i][j];
    }
}