class Solution {
    public int longestSubarray(int[] nums) {
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(m<nums[i]){
                m=nums[i];
            }
        }
        int c=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(m==nums[i]){
                c++;
                l=Math.max(l,c);
            }
            else{
                c=0;
            }
        }
        return l;
    }
}