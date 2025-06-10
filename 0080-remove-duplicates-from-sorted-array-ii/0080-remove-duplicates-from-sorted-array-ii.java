class Solution {
    public int removeDuplicates(int[] nums) {
       int j=1;
       int duplicate=nums[0];
       int c=1;
       for(int i=1;i<nums.length;i++){
            if(duplicate!=nums[i] && ((c==1) || (c==2))){
                nums[j++]=nums[i];
                duplicate=nums[i];
                c=1;
            }
            else if((duplicate== nums[i]) && (c==1)){
                nums[j++]=nums[i];
                c+=1;
            }
       }
       return j;
    }
}
