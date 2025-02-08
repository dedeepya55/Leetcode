class Solution {
    public void gameOfLife(int[][] board) {
        int r=board.length;
        int c=board[0].length;
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            int live=-board[i][j];
            for(int i1=i-1;i1<=i+1;i1++){
                for(int j1=j-1;j1<=j+1;j1++){
                    if(i1>=0 && i1<r && j1>=0 && j1<c && board[i1][j1]>0){
                        // System.out.println(live);
                        live++;
                    }
                }
            }
            if(board[i][j]==1 && (live>3 || live<2)){
                board[i][j]=2; //dead
            }
            if(board[i][j]==0 && (live==3)){
                // System.out.println(board[i][j]);
                board[i][j]=-1; //live
            }
        }
       }
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(board[i][j]==2){
                board[i][j]=0;
            }
            else if(board[i][j]==-1){
                System.out.println(board[i][j]);
                board[i][j]=1;
            }
        }
       }
    }
}