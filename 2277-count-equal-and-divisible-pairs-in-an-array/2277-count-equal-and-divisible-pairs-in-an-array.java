class Solution {
    public int countPairs(int[] nums, int k) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    int h=i*j;
                    if(h%k==0){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}