class Solution {
    public void rotate(int[] nums, int k) {
        if(k==nums.length || k%nums.length==0){
            return;
        }
        else{
            k=k%nums.length;
            rotate(nums,0,nums.length-k);
            for(int i=0;i<nums.length;i++){
                System.out.println(nums[i]);
            }
            rotate(nums,nums.length-k,nums.length);
            rotate(nums,0,nums.length);
        }
    }
    public static void rotate(int[] nums,int i,int j){
       while(i<j){
            int temp=nums[i];
            nums[i]=nums[j-1];
            nums[j-1]=temp;
            i++;
            j--;
        }
    }
}