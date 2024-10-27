class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> l=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            System.out.println(nums[i]);
            l.add(nums[i]);
        }
       }
       for(int i=0;i<nums.length;i++){
        nums[i]=0;
       }
       for(int i=0;i<l.size();i++){
        nums[i]=l.get(i);
       }
        return l.size();
    }
}