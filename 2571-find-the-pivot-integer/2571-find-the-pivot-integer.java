class Solution {
    public int pivotInteger(int n) {
        int tS=(n*(n+1))/2;
        int i=n;
        if(n==1) return 1;
        while(n-->0){
            int k=n*(n+1)/2;
            int rem=tS-k+n;
            if(rem==k){
                return n;
            }
        }
        return -1;
    }
}