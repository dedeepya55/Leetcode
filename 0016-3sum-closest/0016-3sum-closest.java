import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int su = nums[0] + nums[1] + nums[2]; 
        for (int i = 0; i < nums.length - 2; i++) {
            int k = i + 1, j = nums.length - 1;
            while (k < j) {
                int s = nums[i] + nums[k] + nums[j];
                if (Math.abs(target - s) < Math.abs(target - su)) {
                    su = s;
                }
                if (s< target) {
                    k++;
                } else {
                    j--;
                }
            }
        }

        return su;
    }
}
