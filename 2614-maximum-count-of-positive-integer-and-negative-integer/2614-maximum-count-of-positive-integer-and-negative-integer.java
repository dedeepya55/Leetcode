class Solution {
    public int maximumCount(int[] nums) {
       int low=0;int high=nums.length-1;
        // System.out.println(nums.length);
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]<0){
                low=mid+1;
                // System.out.println(low);
            }
            else{
                high=mid;
            }
        }
        if(nums[high]<0){
            System.out.println(high);
            int n=(high+1);
            return n;
            // System.out.println(n);
        }
           int n=low;
            System.out.println(n);
         low = 0;
        high = nums.length - 1;
        while(low<high){
             int mid = (low + high) / 2;
            if (nums[mid] <= 0) {
                low = mid + 1;
                // System.out.println(low);
            } else {
                high = mid;
            }
        }
        // System.out.println(high);
        if(nums[high]==0 && nums[0]==0){
            return 0;
        }
        int p=nums.length-low;
        return (n>p)?n:p; 
    }
}