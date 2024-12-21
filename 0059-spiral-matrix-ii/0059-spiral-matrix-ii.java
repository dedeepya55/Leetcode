class Solution {
    public int[][] generateMatrix(int n) {
      int[][] arr=new int[n][n];
       int top=0;int left=0;int right=n-1;int bottom=n-1;
        List<Integer>l=new ArrayList<>();
        int cnt=0;
        int h=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=h;
                h++;
                cnt++;
                 }
                 if(cnt==(n*n)){
                    break;
                 }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=h;
                h++;
                cnt++;
            }
             if(cnt==(n*n)){
                    break;
                 }
            right--;
            for(int i=right;i>=left;i--){
                arr[bottom][i]=h;
                h++;
                cnt++;
            }
             if(cnt==(n*n)){
                    break;
                 }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                arr[i][left]=h;
                h++;
                cnt++;
            }
             if(cnt==(n*n)){
                    break;
                 }
            left++;
        }
        return arr;
    }
}