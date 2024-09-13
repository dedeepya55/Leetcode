class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                p[i]=arr[i];
            }
            else{
                p[i]=p[i-1]^arr[i];
            }
        }
        int k=queries.length;
        int[] r=new int[k];
        for(int i=0;i<k;i++){
            int l=queries[i][0];
            int ri=queries[i][1];
            if(l==0){
                r[i]=p[ri];
            }
            else{
                r[i]=p[ri]^p[l-1];
            }
        }
        return r;
    }
}