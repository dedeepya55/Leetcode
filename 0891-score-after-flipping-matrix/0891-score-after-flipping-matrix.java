class Solution {
    public int matrixScore(int[][] grid) {
       int m=grid.length;
       int n=grid[0].length;
      for(int r=0;r<m;r++){
        if(grid[r][0]==0){
            for(int c=0;c<n;c++){
                grid[r][c]^=1;
            }
        }
      }
      int ans=0;
        for(int c=0;c<n;c++){
            int colCount=0;
            for(int r=0;r<m;r++){
                colCount+=grid[r][c];
            }
            ans+=Math.max(colCount,m-colCount)*(1<<n-c-1);
        }
        return ans;
    }
}