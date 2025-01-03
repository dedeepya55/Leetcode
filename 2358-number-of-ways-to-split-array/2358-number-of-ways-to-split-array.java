class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] arr=new long[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]+nums[i];
        }
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(arr[i-1]>=(arr[nums.length-1]-arr[i-1])){
                c++;
            }
        }
        return c;
    }
}