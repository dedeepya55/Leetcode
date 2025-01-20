class Solution {
    public boolean checkValid(int[][] matrix) {
        int m=matrix.length;
        int d=0;
        for(int i=0;i<m;i++){
            Set<Integer> s=new HashSet<>();
            for(int j=0;j<m;j++){
                    s.add(matrix[i][j]);
            }
            if(s.size()==m){d++;}
        }
        int d1=0;
        for(int i=0;i<m;i++){
             Set<Integer> s=new HashSet<>();
            for(int j=0;j<m;j++){
                s.add(matrix[j][i]);
            }
             if(s.size()==m){d1++;}
        }
        if(d==m && d1==m){
            return true;
        }
        return false;
    }
}