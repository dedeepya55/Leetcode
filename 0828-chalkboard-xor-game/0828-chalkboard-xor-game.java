class Solution {
    public boolean xorGame(int[] nums) {
        int xor=0;
        for(int i:nums){
            xor=xor^i;
        }
        return nums.length%2==0 || xor==0;
    }
}