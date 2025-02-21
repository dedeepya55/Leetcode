class Solution {
    public long flowerGame(int n, int m) {
        long no=0,ne=0,mo=0,me=0;
        if(n%2==0){
            no=n/2;
        }
        else{
            no=n/2+1;
        }
        ne=n/2;
        if(m%2==0){
            mo=m/2;
        }
        else{
            mo=m/2+1;
        }
        me=m/2;
        long ans=me*no+ne*mo;
        return ans;
    }
}