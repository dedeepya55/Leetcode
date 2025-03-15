class Solution {
    public int maxSubarrays(int[] nums) {
        int c=0;
        int s=0;
        for(int n:nums){
            if(s==0){
                s=n;
            }
            else{
                s=s&n;
            }
            if(s==0) c++;
        }
        return Math.max(1,c);
    }
}