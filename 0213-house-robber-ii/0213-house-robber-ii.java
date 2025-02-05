class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        return Math.max(robHelper(nums, 0, n - 2), robHelper(nums, 1, n - 1));
    }

    private int robHelper(int[] nums, int start, int end) {
        int r = 0, nr = 0, tr;
        for (int i = start; i <= end; i++) {
            tr = Math.max(r, nr);
            r = nr + nums[i];
            nr = tr;
        }
        return Math.max(r, nr);
    }
}
