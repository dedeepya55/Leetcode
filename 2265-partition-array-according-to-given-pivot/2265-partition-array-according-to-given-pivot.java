class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans3 = new ArrayList<>();
        
        for (int num : nums) {
            if (num == pivot) {
                ans3.add(num);
            } else if (num < pivot) {
                ans.add(num);
            } else {
                ans1.add(num);
            }
        }
        
        int[] qq = new int[nums.length];
        int index = 0;
        
        for (int num : ans) {
            qq[index++] = num;
        }
        for (int num : ans3) {
            qq[index++] = num;
        }
        for (int num : ans1) {
            qq[index++] = num;
        }
        
        return qq;
    }
}
