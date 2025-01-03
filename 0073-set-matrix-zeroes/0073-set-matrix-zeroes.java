class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> r=new HashSet<>();
        Set<Integer> c=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(r.contains(i)){
                    matrix[i][j]=0;
                }
                else if(c.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}