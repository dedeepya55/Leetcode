class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int[] ans=new int[2];
        int j=0;
        for(Map.Entry<Integer,Integer> ele:m.entrySet()){
            if(ele.getValue()==1){
                ans[j++]=ele.getKey();
            }
        }
        return ans;
    }
}