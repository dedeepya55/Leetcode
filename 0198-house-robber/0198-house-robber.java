class Solution {
    public int rob(int[] nums) {
        int r=0,nr=0,tr=0;
        for(int i=0;i<nums.length;i++){
            tr=Math.max(r,nr);
            r=nr+nums[i];
            nr=tr;
        }
        tr=Math.max(r,nr);
        return tr;
    }
}