class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,List<Integer>> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                m.get(nums[i]).add(i);
            }
            else{
                List<Integer> l=new ArrayList<>();
                l.add(i);
                m.put(nums[i],l);
            }
        }
        for(List<Integer> i:m.values()){
            for(int j=1;j<i.size();j++){
                if(i.get(j)-i.get(j-1)<=k){
                    return true;
                }
            }
        }
        return false;
        
    }
}