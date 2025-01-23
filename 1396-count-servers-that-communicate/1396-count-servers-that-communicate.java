class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] r=new int[m];
        int[] c=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    r[i]+=1;
                    c[j]+=1;
                }
            }
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && (r[i]>=2 || c[j]>=2)){
                    ans+=1;
                }
            }
        }
        return ans;
    }
}