class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int min=nums.length+1;
        int start=0;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];
            while(sum>=target){
                min=Math.min(min,end-start+1);
                sum-=nums[start++];
            }
        }
        if(min==nums.length+1){
            return 0;
        }
        return min;
    }
}