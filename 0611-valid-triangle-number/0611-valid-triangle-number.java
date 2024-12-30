class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        for(int i=nums.length-1;i>=2;i--){
            int j=i-1;
            int k=0;
            while(k<j){
                if(nums[j]+nums[k]>nums[i]){
                    // System.out.println(nums[i]+" "+nums[k]+" "+nums[j]);
                    s+=(j-k);
                    j--;
                }  
                else{
                    k++;
                }     
            }
        }
        return s;
    }
}