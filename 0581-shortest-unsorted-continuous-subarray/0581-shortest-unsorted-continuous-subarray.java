class Solution {
    public int findUnsortedSubarray(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i:nums){
            l.add(i);
        }
        Collections.sort(l);
        int start=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=l.get(i)){
                start=i;
                break;
            }
        }
        int end=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=l.get(i)){
                end=i;
                break;
            }
        }
        // System.out.println(start+" "+end);
        if(start==0 && end==0) return 0;
        return end-start+1;
    }
}