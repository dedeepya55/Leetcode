class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        Map<Integer,int[]> m=new HashMap<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m.put(mat[i][j],new int[]{i,j});
            }
        }
        int[] rowCompletion=new int[r];
        int[] colCompletion=new int[c];
        for(int i=0;i<arr.length;i++){
            int[] cor=m.get(arr[i]);
            int r1=cor[0];
            int c1=cor[1];
            rowCompletion[r1]++;
            colCompletion[c1]++;
            if(rowCompletion[r1]==c || colCompletion[c1]==r){
                return i;
            }
        }
        return 0;
    }
}