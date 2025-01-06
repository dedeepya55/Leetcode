class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int l=0;
        int h=nums[nums.length-1]-nums[0];
        while(l<h){
            int mid=(l+h)/2;
            if(count(mid,nums)>=p){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public static int count(int mid,int[] nums){
        int i=0;
        int c=0;
        while(i<nums.length-1){
            if(nums[i+1]-nums[i]<=mid){
                c++;
                i+=2;
            }
            else{
                i+=1;
            }
        }
        return c;
    }
}