class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;

        while(right<nums.length){
             m.put(nums[right],m.getOrDefault(nums[right],0)+1);
            while(m.get(nums[right])>k){
                 m.put(nums[left], m.get(nums[left]) - 1);
                left++;
            }
           max=Math.max(max,right-left+1);
           System.out.println(right+" "+left);
            right++;
        }
        return max;
    }
}
