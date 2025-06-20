class Solution {
    public void rotate(int[] nums, int k) {
      k=k%nums.length;

      rotatee(nums,0,nums.length-1);
      rotatee(nums,0,k-1);
      rotatee(nums,k,nums.length-1);
    }
    public void rotatee(int[] nums,int s,int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}