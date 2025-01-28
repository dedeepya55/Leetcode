class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums,(a,b)->{
            if(a.length()==b.length()){
                return b.compareTo(a);
            }
            else{
                return b.length()-a.length();
            }
        });
       for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]);
       }
        return nums[k-1];
    }
}