class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rM=new int[grid.length];
        int[] cM=new int[grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                rM[i]=Math.max(rM[i],grid[i][j]);
                cM[j]=Math.max(cM[j],grid[i][j]);
            }
        }
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                ans+=Math.min(rM[i],cM[j])-grid[i][j];
            }
        }
        return ans;
    }
}