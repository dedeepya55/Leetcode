class Solution {
    public int jump(int[] nums) {
         int m=0;
         int c=0;
        //  int 
         if(nums.length==1){
            return 0;
         }
         int lj=0;
        for(int i=0;i<nums.length;i++){
             m=Math.max(m,i+nums[i]);
            if(lj==i){
                c+=1;
                 lj=m;
            if(m>=nums.length-1){
                return c;
            }
            }
        }
        return 0;
    }
}