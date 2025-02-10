class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        if(nums[left]<nums[right]){
            return nums[0];
        }
        int mid=0;
        while(left<right){
            if(nums[mid]>nums[left]){
                return nums[left];
            }
            mid=(left+right)/2;
            if(nums[left]<=nums[mid]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
    }
}