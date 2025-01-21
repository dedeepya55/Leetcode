class Solution {
    public long gridGame(int[][] grid) {
        int n=grid[1].length;
        int p=0;
        long rs1=0;
       for(int i=0;i<n;i++){
            rs1+=grid[0][i];
       }
        long rs2=0;
        long ans=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            rs1-=grid[0][i];
            ans=Math.min(ans,Math.max(rs1,rs2));
            rs2+=grid[1][i];
        }
        return ans;

    }
}