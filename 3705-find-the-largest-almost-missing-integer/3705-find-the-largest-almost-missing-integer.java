class Solution {
    public int largestInteger(int[] nums, int k) {
     Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i <= nums.length - k; i++) {
            Set<Integer> seenInSubarray = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                seenInSubarray.add(nums[j]);
            }
            for (int num : seenInSubarray) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        int result = -1;
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == 1) { 
                result = Math.max(result, num); 
            }
        }

        return result;
    }
}