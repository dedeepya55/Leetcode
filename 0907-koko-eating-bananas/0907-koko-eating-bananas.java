class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        while(low<high){
            int mid=(low+high)/2;
            int cnt=0;int ho=0;
            for(int i=0;i<piles.length;i++){
                ho+=(piles[i]+mid-1)/mid;
            }
            if(ho>h){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}