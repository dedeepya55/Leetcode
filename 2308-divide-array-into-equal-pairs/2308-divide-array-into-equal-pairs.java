class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry <Integer,Integer> ele:m.entrySet()){
            if(ele.getValue()%2!=0){
                return false;
            }
        }
        return true;
    }
}