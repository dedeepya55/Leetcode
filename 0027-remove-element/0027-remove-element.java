class Solution {
    public int removeElement(int[] nums, int val) {
       int i=0;
       for(int j:nums){
        if(j!=val){
            nums[i++]=j;
        }
       }
       return i;
    }
}