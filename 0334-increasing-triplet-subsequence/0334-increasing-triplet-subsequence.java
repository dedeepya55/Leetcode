class Solution {
    public boolean increasingTriplet(int[] nums) {
        int f=Integer.MAX_VALUE;
        int e=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<=f){
                f=i;
            }
            else if(i<=e){
                e=i;
            }
            else{
                return true;
            }
        }
        return false;
    }
}