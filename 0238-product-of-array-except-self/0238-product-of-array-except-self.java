class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c+=1;
            }
            else{
            p*=nums[i];
            }
        }
        int[] ar=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(c==0){
                ar[i]=p/nums[i];
            }
            else if(c==1){
                if(nums[i]==0){
                    ar[i]=p;
                }
                else{
                    ar[i]=0; 
                }
            }
            else{
                ar[i]=0;
            }
        }
        return ar;
    }
}