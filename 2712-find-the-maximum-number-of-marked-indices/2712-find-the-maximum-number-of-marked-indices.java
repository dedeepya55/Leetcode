class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int i=0;
        int n=nums.length;
        int j=(n+1)/2;
        while(j<n){
            while(j<n && nums[i]*2>nums[j]){
                j++;
            }
            if(j<n){
                ans+=2;
            }
            i++;j++;
        }
        return ans;
    }
}