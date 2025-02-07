class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l = new ArrayList<>();
        if (nums.length == 0) return l;

        int start = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) { 
                if (start == nums[i - 1]) { 
                    l.add(String.valueOf(start));
                } else {
                    l.add(start + "->" + nums[i - 1]);
                }
                start = nums[i]; 
            }
        }
        if (start == nums[nums.length - 1]) {
            l.add(String.valueOf(start));
        } else {
            l.add(start + "->" + nums[nums.length - 1]);
        }

        return l;
    }
}
