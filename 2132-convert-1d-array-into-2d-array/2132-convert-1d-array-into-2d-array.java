class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
       int[][] l=new int[m][n];
        if(original.length!=(m*n)){
            return new int[0][0];
        }
        int h=0;
        for(int i=0;i<m;i++){
            int[] k=new int[n];
            for(int j=0;j<n;j++){
                k[j]=original[h];
                h=h+1;
            }
            l[i]=k;
        }
        return l;
    }
}