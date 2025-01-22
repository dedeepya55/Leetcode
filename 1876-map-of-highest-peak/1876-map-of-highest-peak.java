class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int row=isWater.length;
        int col=isWater[0].length;
        Deque<int[]> q=new ArrayDeque<>();
        int[][] hp=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               hp[i][j]=isWater[i][j]-1;
               if(hp[i][j]==0){
                q.offer(new int[]{i,j});
               }
            }
        }
        int[] dir=new int[]{0,1,0,-1,0};
        while(!q.isEmpty()){
            int[] arr=q.poll();
            int r=arr[0];
            int c=arr[1];
            for(int k=0;k<4;k++){
                int x=r+dir[k];
                int y=c+dir[k+1];
                if(x>=0 && x<row && y>=0 && y<col && hp[x][y]==-1){
                    hp[x][y]=hp[r][c]+1;
                    q.offer(new int[]{x,y});
                }
            }
        }
        return hp;
    }
}