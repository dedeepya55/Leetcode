class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0;int left=0;int right=m-1;int bottom=n-1;
        List<Integer>l=new ArrayList<>();
        int cnt=0;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                l.add(matrix[top][i]);
                cnt++;
                 }
                 if(cnt==(n*m)){
                    break;
                 }
            top++;
            for(int i=top;i<=bottom;i++){
                l.add(matrix[i][right]);
                cnt++;
            }
             if(cnt==(n*m)){
                    break;
                 }
            right--;
            for(int i=right;i>=left;i--){
                l.add(matrix[bottom][i]);
                cnt++;
            }
             if(cnt==(n*m)){
                    break;
                 }
            bottom--;
            for(int i=bottom;i>=top;i--){
                l.add(matrix[i][left]);
                cnt++;
            }
             if(cnt==(n*m)){
                    break;
                 }
            left++;
        }
        return l;
    }
}