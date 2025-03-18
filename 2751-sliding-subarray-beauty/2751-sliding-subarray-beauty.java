class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] ans=new int[nums.length-k+1];
        int[] count=new int[50];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                count[nums[i]+50]++;
            }
            if(i-k>=0 && nums[i-k]<0){
                count[nums[i-k]+50]--;
            }
            if(i+1>=k){
                ans[i-k+1]=xthsmallest(count,x);
            }
        }
        return ans;
    }
    public int xthsmallest(int[] count,int x){
        int p=0;
        for(int i=0;i<50;i++){
            p+=count[i];
            if(p>=x){
                return i-50;
            }
        }
        return 0;
    }
}
