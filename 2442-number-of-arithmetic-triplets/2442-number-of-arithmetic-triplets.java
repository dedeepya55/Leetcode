class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int i=0;int c=0;
        int n=nums.length;
        for (i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=j+1;
            while (j<n-1){
                if(nums[j]-nums[i]==diff)
                {
                    while (k<n && nums[k]-nums[j]<diff){
                        k=k+1;
                    }
                    if (k<n && nums[k]-nums[j]==diff){
                        c+=1;
                    }
                }
                j+=1;
                k=j+1;
            }

        }
        return c;
    }
}