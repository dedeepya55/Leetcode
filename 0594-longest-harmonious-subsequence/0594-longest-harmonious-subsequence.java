class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> m=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int c=0;
        int d=0;
        List<Integer> l=new ArrayList<>();
        for(Integer k:m.keySet()){
            l.add(k);
        }
        for(int i=0;i<l.size()-1;i++){
            if(l.get(i+1)-l.get(i)==1){
                c=m.get(l.get(i+1))+m.get(l.get(i));
                d=Math.max(c,d);
            }
        }
        return d;
    }
}