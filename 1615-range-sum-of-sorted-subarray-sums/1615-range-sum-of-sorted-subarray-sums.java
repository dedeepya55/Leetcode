class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int totalSubarrays=n*(n+1)/2;
        int[] subArraySums=new int[totalSubarrays];
        int i=0;
        for(int j=0;j<n;j++){
            int cS=0;
            for(int k=j;k<n;k++){
                cS+=nums[k];
                subArraySums[i++]=cS;
            }
        }
        Arrays.sort(subArraySums);
        int r=0;
        int mod=(int) 1e9+7;
        for(int o=left-1;o<right;o++){
           r=(r+subArraySums[o])%mod;
        }
        return r;
    }
}
    
      