class Solution {
    public int minCapability(int[] nums, int k) {
        int low=Integer.MAX_VALUE;
         int high=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            low=Math.min(low,nums[i]);
            high=Math.max(high,nums[i]);
        }
        int ans=0;
        while(low<high){
            int mid=(low+high)/2;
            if(isValid(nums,mid,k)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean isValid(int[] nums,int mid,int k){
        int cnt=0;
        int l=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            // System.out.println(nums[i]+" "+mid+"hai"+cnt +" "+i+" "+(l+1));
            if((nums[i]>mid) || (i==(l+1))) continue;
            else{
                cnt++;
                l=i;
            }
        }
        System.out.println(mid+" "+cnt);
        return cnt>=k;
    }
}