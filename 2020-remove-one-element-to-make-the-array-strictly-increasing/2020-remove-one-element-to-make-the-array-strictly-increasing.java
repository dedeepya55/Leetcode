class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n=nums.length;int c=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]>=nums[i]){
                c+=1;
                if(c>1){
                    return false;
                }
            if(i==1||nums[i-2]<nums[i]||i==n-1||nums[i-1]<nums[i+1]){
                continue;
            }
            else{
                return false;
            }
        }
        }
        return true;
    }
}