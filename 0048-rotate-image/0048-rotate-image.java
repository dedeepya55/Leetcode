class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<n;i++){
            int start=0,end=n-1;
            while(start<end){
                int t=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=t;
                start++;
                end--;
            }
        }
    }
}