class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        int duplicate=nums[0];
        for(int i=1;i<nums.length;i++){
            if(duplicate!=nums[i]){
                nums[j++]=nums[i];
                duplicate=nums[i];
            }
        }
        return j;
    }
}