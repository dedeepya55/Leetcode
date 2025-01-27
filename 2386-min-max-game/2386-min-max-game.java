class Solution {
    public int minMaxGame(int[] nums) {
        int[] rrr=new int[nums.length/2];
        if(nums.length==1){
           return nums[0];
        }
        boolean bool=true;
        for(int i=0;i<nums.length/2;i+=1){
            if(bool){
                rrr[i]=Math.min(nums[2*i],nums[2*i+1]);
                bool=!bool;
            }
            else{
                 rrr[i]=Math.max(nums[2*i],nums[2*i+1]);
                    bool=!bool;
            }
        }
        return minMaxGame(rrr);
    }
}