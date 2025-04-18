class Solution {
    public int reachNumber(int target) {
        target=Math.abs(target);
        int ans=0;
        int pos=0;
        while(pos<target){
            ans=ans+1;
            pos+=ans;
            while((pos-target)%2==1){
                ans=ans+1;
                pos+=ans;
            }
        }
        return ans;
    }
}