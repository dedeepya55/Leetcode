class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            return (nums[0] < nums[1]) ? 1 : 0;
        }
        if (nums.length == 3) {
            if (nums[0] < nums[1] && nums[1] > nums[2]) {
                return 1; 
            } 
            return (nums[0] > nums[2]) ? 0 : 2; 
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return (nums[0] > nums[nums.length - 1]) ? 0 : nums.length - 1;
    }
}
