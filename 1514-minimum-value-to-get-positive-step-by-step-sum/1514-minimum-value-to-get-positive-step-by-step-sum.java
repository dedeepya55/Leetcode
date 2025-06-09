class Solution {
    public int minStartValue(int[] nums) {
        int[] pS=new int[nums.length];
        pS[0]=nums[0];
        int min=pS[0];
        for(int i=1;i<nums.length;i++){
            pS[i]=pS[i-1]+nums[i];
            min=Math.min(min,pS[i]);
        }
        System.out.println(min);
        if(min>0){
            return 1;
        }
        return (min*-1)+1;
    }
}