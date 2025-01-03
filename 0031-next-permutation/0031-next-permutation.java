class Solution {
    public void swap(int i,int j,int[]nums){
        int k=nums[i];
        nums[i]=nums[j];
        nums[j]=k;
    }
    public void reverse(int start, int end, int[] nums) {
    while (start < end) {
        swap(start, end, nums);
        start++;
        end--;
    }
    }

    public void nextPermutation(int[] nums) {
        int f=0;
        int l=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                f=i;
                l+=1;
                break;
            }
        }
        if(l==0){
            reverse(0,nums.length-1,nums);
        }
        else{
         for (int j = nums.length - 1; j > f; j--) {
            if (nums[j] > nums[f]) {
                swap(f, j, nums);
                break;
            }
        }
        reverse(f + 1, nums.length - 1, nums);
        }
    }
}